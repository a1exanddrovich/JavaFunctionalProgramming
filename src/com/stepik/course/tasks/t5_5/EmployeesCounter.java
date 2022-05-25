package com.stepik.course.tasks.t5_5;

import java.util.Arrays;
import java.util.List;

public class EmployeesCounter {

    /**
     * Calculates the number of employees with salary >= threshold (only for 111- departments)
     *
     * @param departments are list of departments
     * @param threshold is lower edge of salary
     *
     * @return the number of employees
     */
    public static long calcNumberOfEmployees(List<Department> departments, long threshold) {
         return departments
                .stream()
                .filter(department -> department.getCode().startsWith("111-"))
                .flatMap(department -> department.getEmployees().stream())
                .filter(employee -> employee.getSalary() >= threshold)
                .count();
    }

    public static void main(String[] args) {
        List<Department> departments = Arrays.asList(
                new Department("dep-1", "111-1", Arrays.asList(
                        new Employee("William", 15000L),
                        new Employee("Sophia", 22000L),
                        new Employee("John", 20000L)
                )),
                new Department("dep-2", "222-1", Arrays.asList(
                        new Employee("Victor", 25000L)
                ))
        );

        System.out.println(calcNumberOfEmployees(departments, 20000));
    }

}
