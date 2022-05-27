package com.stepik.course.tasks.t7_2;

import java.util.Optional;

public class Failure<T> implements Try<T> {

    private final Throwable e;

    Failure(Throwable e) {
        this.e = e;
    }

    @Override
    public T get() throws Throwable {
        return e;
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
        return "Failure[" + e + "]";
    }

}
