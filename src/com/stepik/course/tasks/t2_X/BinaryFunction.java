package com.stepik.course.tasks.t2_X;

@FunctionalInterface
public interface BinaryFunction<U, R, T> {

    T apply(U arg1, R arg2);

}
