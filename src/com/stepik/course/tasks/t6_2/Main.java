package com.stepik.course.tasks.t6_2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        DoubleStream stream = DoubleStream.generate(Math::random).limit(5);

        IntStream stream1 = Arrays.stream(new int[] { 1, 2, 3, 4 }); // 1, 2, 3, 4

        LongStream longStream = new Random().longs().limit(5);

        IntStream chars = "adasd".codePoints();

        OptionalInt max = IntStream.of(1, 2, 3).max();

        IntSummaryStatistics intSummaryStatistics = IntStream.of(1, 2, 3, 4, 5, 6).summaryStatistics();

        System.out.println(intSummaryStatistics.getAverage());

        Stream<Integer> boxed = IntStream.of(12, 5, 6, 7).boxed();

    }

}
