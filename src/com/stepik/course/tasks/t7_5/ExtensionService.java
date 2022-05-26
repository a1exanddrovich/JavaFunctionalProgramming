package com.stepik.course.tasks.t7_5;

import java.util.function.Function;
import java.util.function.Predicate;

public class ExtensionService {

    public static Function<String, String> addExtension(Predicate<String> matchFirst, Predicate<String> matchSecond) {
        return s -> matchFirst.test(s) ? s + ".xml" : matchSecond.test(s) ? s + ".json" : s;
    }

    public static void main(String[] args) {
        Function<String, String> func = addExtension(y->y.equals("First"),y->y.equals("Second"));
        System.out.println(func.apply("First"));//should print First.xml
        System.out.println(func.apply("Second"));//should print Second.json
        System.out.println(func.apply("Otherwise"));//should print Otherwise
    }

}
