package com.stepik.course.tasks.t7_1.strategypattern.app;

public class User {

    private final String email;
    private final String phoneNumber;

    User(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
