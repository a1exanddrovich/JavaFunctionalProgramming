package com.stepik.course.tasks.t5_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AverageSalary {

    public static double averageSalary(List<Employee> employees) {
        return employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
    }


    public static void main(String[] args) {
        System.out.println(averageSalary(new ArrayList<>()));
    }

}
