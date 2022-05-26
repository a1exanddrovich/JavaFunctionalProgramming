package com.stepik.course.tasks.t6_4;

import java.util.Arrays;
import java.util.Scanner;

public class NumbersProcessing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted()
                .map(n -> n * 2)
                .parallel()
                .forEachOrdered(System.out::println);
    }

}
