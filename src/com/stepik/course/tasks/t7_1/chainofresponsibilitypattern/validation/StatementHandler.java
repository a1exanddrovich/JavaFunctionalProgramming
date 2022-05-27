package com.stepik.course.tasks.t7_1.chainofresponsibilitypattern.validation;

public abstract class StatementHandler {

    protected StatementHandler nextHandler;

    public void setNextHandler(StatementHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    abstract boolean isValid(String statement);

}
