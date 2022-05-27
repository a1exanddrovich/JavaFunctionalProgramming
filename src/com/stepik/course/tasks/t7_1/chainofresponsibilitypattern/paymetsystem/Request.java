package com.stepik.course.tasks.t7_1.chainofresponsibilitypattern.paymetsystem;

public class Request {

    private final String data;

    public Request(String requestData) {
        this.data = requestData;
    }

    public String getData() {
        return data;
    }

}
