package com.stepik.course.tasks.t6_5;

import java.util.Spliterator;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args) {
        long sum = LongStream.iterate(0, i -> i + 1)
                .limit(100_000_000)
                .reduce(0, Long::sum);

        System.out.println("Sum: " + sum);

//        long sum2 = LongStream.iterate(0, i -> i + 1)
//                .parallel()
//                .limit(100_000_000)
//                .reduce(0, Long::sum);
//
//        System.out.println("Sum: " + sum2);
//
//        Spliterator.OfLong spliterator = LongStream.range(1, 200000).spliterator();
//        Spliterator.OfLong spliterator1 = spliterator.trySplit();
//        Spliterator.OfLong spliterator2 = spliterator.trySplit();
//
//        System.out.println(spliterator1.estimateSize());

        System.out.println(IntStream.generate(() -> 2).spliterator().hasCharacteristics(Spliterator.ORDERED));


    }

}
