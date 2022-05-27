package com.stepik.course.tasks.trymonad;

/**
 * Represents an operation that may potentially fail with an exception
 */
@FunctionalInterface
public interface ThrowableOperation<T> {

    T execute() throws Throwable;

}
