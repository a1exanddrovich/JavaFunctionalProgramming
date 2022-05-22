package com.stepik.course.tasks.t4_3;

import java.util.function.Function;

/**
 * The interface represents the very basic monadic operations
 *
 * @param <T>
 */
public interface Monad<T> {

    Monad<T> unit(T value);

    <U> Monad<U> map(Function<T, U> f);

    <U> Monad<U> flatMap(Function<T, Monad<U>> f);

    T get();

}
