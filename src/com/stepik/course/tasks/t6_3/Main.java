package com.stepik.course.tasks.t6_3;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.partitioningBy;

public class Main {

    public static void main(String[] args) {
        Stream<Integer> degrees = Stream.of(10, 11, 12, 42, 123);
        Map<Boolean, List<Integer>> degreePartition = degrees.collect(
                partitioningBy(degree -> degree > 0)
        );

        System.out.println(degreePartition);
    }

}
