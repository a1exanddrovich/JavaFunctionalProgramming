package com.stepik.course.tasks.t7_3;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {
        CompletableFuture<Integer> completableFuture = CompletableFuture.completedFuture(42);
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                System.out.println("Run async" + i);
            }
        });
        while (!future.isDone()) {
            System.out.println("Not done");
            System.out.println("Doing smth else");
        }
        if (future.isDone()) {
            System.out.println("Done");
        }
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                System.out.println("Run async" + i);
            }
            return 1_000_000;
        });

        CompletableFuture<Void> printOneMillion = future1.thenAccept(System.out::println);

        CompletableFuture<List<String>> actionsFuture =
                CompletableFuture.supplyAsync(() -> List.of("Run", "Debug", "Build", "Cancel"));

        CompletableFuture<Void> printActionsFuture = actionsFuture
                .thenApply(actions -> actions.subList(0, 2)) // line A
                .thenApply(actions -> actions.size()) // line B
                .thenAccept(System.out::println); // line C
    }

}
