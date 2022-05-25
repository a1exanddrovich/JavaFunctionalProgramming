package com.stepik.course.tasks.t6_1;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        Stream<Integer> stream = Stream.generate(random::nextInt); // an infinite stream

        List<Integer> numbers = Stream.generate(random::nextInt)
                .limit(5) // get rid of the rest of the stream
                .collect(Collectors.toList());
    }

}
