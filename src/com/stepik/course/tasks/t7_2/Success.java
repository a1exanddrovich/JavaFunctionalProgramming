package com.stepik.course.tasks.t7_2;

import java.util.Optional;

/**
 * Represents a successful execution
 */
public class Success<T> implements Try<T> {

    private final T value;

    Success(T value) {
        this.value = value;
    }

    @Override
    public T get() {
        return value;
    }

    @Override
    public T getUnchecked() {
        // write your code here
    }

    @Override
    public Optional<T> toOptional() {
        // write your code here
    }

    @Override
    public boolean isSuccess() {
        // write your code here
    }

    @Override
    public String toString() {
        return "Success[" + value + "]";
    }

}
