package com.stepik.course.tasks.t5_5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AbsoluteNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(e -> e.replace("-", ""))
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }

}
