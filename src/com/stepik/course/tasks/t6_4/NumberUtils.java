package com.stepik.course.tasks.t6_4;

import java.util.stream.LongStream;

public class NumberUtils {

    public static boolean isPrime(long n) {
        return n > 1 && LongStream
                .rangeClosed(2, n - 1)
                .noneMatch(divisor -> n % divisor == 0);
    }

    public static LongStream createPrimesFilteringStream(long start, long end) {
        return LongStream.rangeClosed(start, end).filter(NumberUtils::isPrime).parallel();
    }

    public static void main(String[] args) {
        createPrimesFilteringStream(0,1000).forEach(System.out::println);
    }

}
