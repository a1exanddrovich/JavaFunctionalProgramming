package com.stepik.course.tasks.trymonad;

/**
 * Represents an action that may potentially fail with an exception
 */
@FunctionalInterface
public interface ThrowableConsumer<T, E extends Throwable> {

    void accept(T t) throws E;

}
