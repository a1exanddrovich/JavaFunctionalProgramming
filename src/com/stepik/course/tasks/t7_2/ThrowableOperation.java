package com.stepik.course.tasks.t7_2;

/**
 * Represents an operation that may potentially fail with an exception
 */
@FunctionalInterface
public interface ThrowableOperation<T> {

    T execute() throws Throwable;

}
