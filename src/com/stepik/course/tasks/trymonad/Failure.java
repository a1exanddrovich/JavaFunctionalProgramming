package com.stepik.course.tasks.trymonad;

import java.util.Optional;

public class Failure<T> implements Try<T> {

    private final Throwable e;

    Failure(Throwable e) {
        this.e = e;
    }

    @Override
    public T get() throws Throwable {
        throw this.e;
    }

    @Override
    public T getUnchecked() {
        throw new RuntimeException(this.e);
    }

    @Override
    public Optional<T> toOptional() {
        return Optional.empty();
    }

    @Override
    public boolean isSuccess() {
        return false;
    }

    @Override
    public String toString() {
        return "Failure[" + e + "]";
    }

}
