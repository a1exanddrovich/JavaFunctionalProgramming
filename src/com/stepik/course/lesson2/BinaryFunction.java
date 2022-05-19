package com.stepik.course.lesson2;

@FunctionalInterface
public interface BinaryFunction<U, R, T> {

    T apply(U arg1, R arg2);

}
