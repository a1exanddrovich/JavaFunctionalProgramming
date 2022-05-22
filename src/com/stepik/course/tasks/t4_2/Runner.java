package com.stepik.course.tasks.t4_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<Laptop> laptops = new ArrayList<>();

        laptops.add(new Laptop("HP", 4, 15.6));
        laptops.add(new Laptop("Apple", 6, 15.6));
        laptops.add(new Laptop("Asus", 4, 14.1));
        laptops.add(new Laptop("Dell", 8, 17.0));
        laptops.add(new Laptop("Old but work", 1, 15.1));

        Comparator<Laptop> comparatorByNumberOfCores = Comparator.comparingInt(Laptop::getNumberOfCores);

        laptops.forEach(System.out::println);
        laptops.sort(comparatorByNumberOfCores);
        laptops.forEach(System.out::println);

    }

}
