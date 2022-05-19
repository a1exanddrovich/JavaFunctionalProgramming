package com.stepik.course.tasks;

@FunctionalInterface
public interface BinaryFunction<U, R, T> {

    T apply(U arg1, R arg2);

}
