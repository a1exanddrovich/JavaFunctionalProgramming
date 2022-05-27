package com.stepik.course.tasks.t7_2;

public class MainTryTest {

    public static void main(String[] args) {
        Try<Integer> tryParseSuccess = Try.of(() -> Integer.parseInt("23")); // Success[23]

        System.out.println(tryParseSuccess.isSuccess()); // true
        System.out.println(tryParseSuccess.getUnchecked()); // 23
        System.out.println(tryParseSuccess.toOptional().isEmpty()); // false


        Try<Integer> tryParseFailure = Try.of(() -> Integer.parseInt("V23")); // Failure[java.lang.NumberFormatException: For input string: "V23"]

        System.out.println(tryParseFailure.isSuccess()); // false
        System.out.println(tryParseFailure.toOptional().isEmpty()); // true
        System.out.println(tryParseFailure.getUnchecked()); // throws a RuntimeException that wraps the initial one

        int n = 100;
        Try<Integer> division = Try.of(() -> n / 0); // Failure[java.lang.ArithmeticException: / by zero]
    }

}
