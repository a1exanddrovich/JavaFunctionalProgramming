package com.stepik.course.tasks.t5_3;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        int result = Stream.of(1, 2, 3, 4, 5)
                .peek(System.out::println)
                .filter(n -> n >= 3)
                .findAny()
                .get();

        System.out.println("Result: " + result);

        boolean e = Stream.of(1, 2, 3, 4, 5)
                .peek(System.out::println)
                .allMatch(n -> n < 3);

        System.out.println("Result: " + e); // false
    }

}
