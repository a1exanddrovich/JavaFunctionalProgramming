package com.stepik.course.tasks.t6_5;

import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;

public class MainTest {

    public static void main(String[] args) {
        List<Integer> nums = IntStream.range(0, 2000).boxed().collect(Collectors.toList());

        Spliterator<Integer> spliterator = new CustomSpliterator(
                nums, 0, nums.size() - 1
        );

        Integer sum = StreamSupport.stream(spliterator, true).reduce(0, Integer::sum, Integer::sum);
        System.out.println(sum);
    }

}
