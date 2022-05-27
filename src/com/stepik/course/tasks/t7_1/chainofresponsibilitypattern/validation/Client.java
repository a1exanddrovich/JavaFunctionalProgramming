package com.stepik.course.tasks.t7_1.chainofresponsibilitypattern.validation;

import java.util.function.Predicate;

public class Client {

    public static void main(String[] args) {
        String s = "Chain chain = new Chain();";

        StatementHandler lineEndHandler = new LineEndHandler();
        StatementHandler lengthHandler = new LengthHandler();
        StatementHandler valHandler = new ValHandler();

        lineEndHandler.setNextHandler(lengthHandler);
        lengthHandler.setNextHandler(valHandler);

        lineEndHandler.isValid(s);

    }

    public static void main2(String[] args) {
        String s = "Chain chain = new Chain();";

        Predicate<String> lineEndHandler = (statement) -> statement.endsWith(";");
        Predicate<String> lengthHandler = (statement) -> statement.length() > 50;
        Predicate<String> valHandler = (statement) -> statement.contains("val");

        boolean isValid = lineEndHandler.and(lengthHandler).and(valHandler).test(s);

    }

}
