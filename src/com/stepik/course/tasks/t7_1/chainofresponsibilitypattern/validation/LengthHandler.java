package com.stepik.course.tasks.t7_1.chainofresponsibilitypattern.validation;

public class LengthHandler extends StatementHandler {

    @Override
    boolean isValid(String statement) {
        if (statement.length() > 50) {
            return false;
        }

        if (nextHandler != null) {
            return nextHandler.isValid(statement);
        }

        return true;
    }

}
