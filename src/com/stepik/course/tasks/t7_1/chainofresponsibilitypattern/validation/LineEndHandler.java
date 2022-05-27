package com.stepik.course.tasks.t7_1.chainofresponsibilitypattern.validation;

public class LineEndHandler extends StatementHandler {

    @Override
    boolean isValid(String statement) {
        if (!statement.endsWith(";")) {
            return false;
        }

        if (nextHandler != null) {
            return nextHandler.isValid(statement);
        }
        return true;
    }

}
