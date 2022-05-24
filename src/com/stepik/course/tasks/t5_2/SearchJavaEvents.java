package com.stepik.course.tasks.t5_2;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SearchJavaEvents {

    private static final String JAVA = "java";

    public static void printSortedJavaEvents(List<String> events) {
        events
                .stream()
                .filter(event -> event.toLowerCase().contains("java"))
                .sorted()
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> events = Stream
                .iterate(1, i -> scanner.hasNextLine(), i -> i + 1)
                .map(i -> scanner.nextLine())
                .collect(Collectors.toList());

        printSortedJavaEvents(events);
    }

}
