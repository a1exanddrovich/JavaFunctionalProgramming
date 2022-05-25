package com.stepik.course.tasks.t5_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Competition {

    public static Map<String, Integer> getTeamPlaceMap(Collection<Team> teams) {
        Map<String, Integer> collect = teams.stream().collect(Collectors.toMap(Team::getName, Team::getPlace));
        return collect.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        Collection<Team> teams = new ArrayList<>();

//        Collection<Team> teams = Stream
//                .iterate(1, i -> scanner.hasNextLine(), i -> i + 1)
//                .map(i -> scanner.nextLine().split("\\s+"))
//                .map(parts -> new Team(parts[0], Integer.parseInt(parts[1])))
//                .collect(Collectors.toSet());

        getTeamPlaceMap(teams)
                .forEach((team, speaker) -> System.out.println(team + ": " + speaker));

        List<Integer> numbers = Arrays.asList(4, 7, 4, 2, 1, 6, 4);
        System.out.println((Integer) numbers.stream().mapToInt(i -> i + 4).sum());
    }

}
