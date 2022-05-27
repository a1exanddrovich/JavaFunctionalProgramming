//package com.stepik.course.tasks.t7_4;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.ConcurrentHashMap;
//import java.util.function.Function;
//
//public class QueryUtils {
//
//    public static <R> Map<String, R> execute(List<String> tables, Function<String, R> query, R defaultValue) {
//        Map<String, R> tableToResultMap = new ConcurrentHashMap<>();
//
//        List<CompletableFuture<R>> futures = new ArrayList<>();
//        for (String table : tables) {
//            CompletableFuture<R> handle = CompletableFuture
//                    .supplyAsync(() -> tableToResultMap.put(table, query.apply(table)))
//                    .handle((result, exception) -> {
//                        if (exception != null) {
//                            return defaultValue;
//                        } else {
//                            return result;
//                        }
//                    });
//            futures.add(handle);
//        }
//
//
//
////        CompletableFuture<?>[] futures = tables.stream()
////                .map(table -> CompletableFuture
////                        .supplyAsync(() -> tableToResultMap.put(table, query.apply(table))
////                        ).handle((result, exception) -> {
////                            if (exception != null) {
////                                return defaultValue;
////                            } else {
////                                return result;
////                            }
////                        })
////                )
////                .toArray(CompletableFuture[]::new);
//
//        CompletableFuture.allOf(tableToResultMap).join();
//
//        return tableToResultMap;
//    }
//
//    public static void main(String[] args) {
//        Map<String, String> execute = execute(List.of("table1", "table2"), s -> {
//            if (s.equals("table2")) {
//                throw new RuntimeException();
//            }
//            return "completed";
//        }, "Default");
//
//        System.out.println(execute);
//    }
//
//}
