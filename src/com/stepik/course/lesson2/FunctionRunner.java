package com.stepik.course.lesson2;

public class FunctionRunner {

    public static void main(String[] args) {

        Function multiplicationFunction = new Function() {
            @Override
            public Integer apply(Integer t) {
                return t * t;
            }
        };

        System.out.println(multiplicationFunction.apply(2));

    }

}
