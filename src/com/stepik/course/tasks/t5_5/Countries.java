package com.stepik.course.tasks.t5_5;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Countries {

    public static List<String> getNamesOfTop3PopulatedCountries(Collection<Country> countries) {
        return countries
                .stream()
                .sorted(Comparator.comparingInt(Country::getPopulation).reversed())
                .limit(3)
                .map(Country::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        List<Country> countries = Stream.iterate(1, i -> scanner.hasNextLine(), i -> i + 1)
//                .map(i -> scanner.nextLine())
//                .map(inputLine -> {
//                    String[] parts = inputLine.split("\\s+");
//                    return new Country(parts[0], Integer.parseInt(parts[1]));
//                })
//                .collect(Collectors.toList());
//
//        getNamesOfTop3PopulatedCountries(countries)
//                .forEach(System.out::println);
    }

}
