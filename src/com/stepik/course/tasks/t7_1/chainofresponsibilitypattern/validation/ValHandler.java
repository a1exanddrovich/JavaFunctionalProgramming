package com.stepik.course.tasks.t7_1.chainofresponsibilitypattern.validation;

public class ValHandler extends StatementHandler {

    @Override
    boolean isValid(String statement) {
        if (statement.contains("val")) {
            return false;
        }

        if (nextHandler != null) {
            return nextHandler.isValid(statement);
        }

        return true;
    }

}
