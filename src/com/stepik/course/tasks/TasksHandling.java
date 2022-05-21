package com.stepik.course.tasks;

import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TasksHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfQueues = Integer.parseInt(scanner.nextLine());
        int numberOfTasks = Integer.parseInt(scanner.nextLine());

        TaskManager manager = new TaskManager(numberOfQueues);

        for (int i = 0; i < numberOfTasks; i++) {
            String[] taskParts = scanner.nextLine().split("\\s+");
            long number = Long.parseLong(taskParts[0]);
            int priority = Integer.parseInt(taskParts[1]);
            Task task = new Task(number, priority);
            manager.add(task, priority);
        }

        Supplier<Task> taskSupplier = manager.getTaskSupplier();
        Task task;
        while ((task = taskSupplier.get()) != null) {
            System.out.println(task.getNumber());
        }
    }

    public static IntPredicate conjunctAll(List<IntPredicate> predicates) {
        return predicates.stream().reduce(IntPredicate::and).orElse(value -> true);
    }

    public static <T> Predicate<T> xor(Predicate<T> predicate1, Predicate<T> predicate2) {
        return predicate1.or(predicate2).and(((predicate1.and(predicate2)).negate()));
    }


}
