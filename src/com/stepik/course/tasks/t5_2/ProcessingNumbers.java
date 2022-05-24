//package com.stepik.course.tasks.t5_2;
//
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Scanner;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class ProcessingNumbers {
//
//    public static Stream<Integer> getStream(Collection<Integer> numbers) {
//        return switch ((int) (Math.random() * 3)) {
//            case 0 -> numbers.stream()
//                    .sorted()
//                    .takeWhile(number -> number < 100);
//            case 1 -> numbers.stream()
//                    .sorted(Comparator.reverseOrder())
//                    .dropWhile(number -> number >= 100)
//                    .sorted();
//            default -> numbers.stream()
//                    .filter(number -> number < 100)
//                    .sorted();
//        };
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
//                .map(Integer::parseInt)
//                .collect(Collectors.toList());
//
//        String result = getStream(numbers)
//                .map(String::valueOf)
//                .collect(Collectors.joining(" "));
//
//        System.out.println(result);
//    }
//
//}
