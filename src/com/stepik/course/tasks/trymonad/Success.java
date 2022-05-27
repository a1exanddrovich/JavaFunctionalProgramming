package com.stepik.course.tasks.trymonad;

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
        return this.value;
    }

    @Override
    public T getUnchecked() {
        return this.value;
    }

    @Override
    public Optional<T> toOptional() {
        return Optional.of(this.value);
    }

    @Override
    public boolean isSuccess() {
        return true;
    }

    @Override
    public String toString() {
        return "Success[" + value + "]";
    }

}
