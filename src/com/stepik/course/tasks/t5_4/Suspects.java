package com.stepik.course.tasks.t5_4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Suspects {

    public static List<String> reduceSuspects(List<String> suspects) {
        return suspects.stream().filter(suspect -> suspect.contains("jo")).sorted().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> suspects = Stream.of("maddox hopper", "remi joyner", "martyn wilks", "jim burks", "joshua parry", "mojo milner")
                        .collect(Collectors.toList());

        reduceSuspects(suspects)
                .forEach(System.out::println);
    }

}
