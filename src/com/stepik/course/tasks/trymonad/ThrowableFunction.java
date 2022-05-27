package com.stepik.course.tasks.trymonad;

@FunctionalInterface
public interface ThrowableFunction<T, R> {

    R apply(T t) throws Throwable;

}
