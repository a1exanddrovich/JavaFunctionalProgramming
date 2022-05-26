package com.stepik.course.tasks.t7_5;

import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class Main {

    public static IntBinaryOperator calculatePoints(IntUnaryOperator evaluator) {
        return (left, right) -> evaluator.applyAsInt(left) + evaluator.applyAsInt(right);
    }

    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator = calculatePoints(x -> x * 2);
        int result = intBinaryOperator.applyAsInt(2, 3);
        System.out.println(result);
    }

}
