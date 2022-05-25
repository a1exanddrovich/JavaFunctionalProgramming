package com.stepik.course.tasks.t5_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InflationProblem {

    private static int getTimesByGroceryType(Grocery grocery) {
        return grocery.getCategory().equals(Category.VEGETABLES) ? 3 :
                grocery.getCategory().equals(Category.FRUITS) ? 4 : 2;
    }

    public static long calculateTotalPriceInFuture(int numberOfYears, List<Grocery> groceries) {
        return groceries
                .stream().map(grocery -> {
                    int times = getTimesByGroceryType(grocery);
                    return (int) (grocery.getCost() * Math.pow(times, numberOfYears));
                }).reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfYears = Integer.parseInt(scanner.nextLine());

//        List<Grocery> groceries = Stream.iterate(1, i -> scanner.hasNextLine(), i -> i + 1)
//                .map(i -> scanner.nextLine())
//                .map(inputLine -> {
//                    String[] parts = inputLine.split("\\s+");
//                    return new Grocery(Long.parseLong(parts[0]), Category.valueOf(parts[1]));
//                })
//                .collect(Collectors.toList());

        long totalPriceInFuture = calculateTotalPriceInFuture(numberOfYears, new ArrayList<>());

        System.out.println(totalPriceInFuture);
    }

}
