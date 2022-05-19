package com.stepik.course.tasks;

import java.util.function.BiFunction;

public class FunctionRunner {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> function = (x, y) -> x < y ? x : y;

        System.out.println(function.apply(7, 6));


    }

}
