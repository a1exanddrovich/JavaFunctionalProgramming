package com.stepik.course.tasks.trymonad;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

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
    public T getOrElse(T defaultValue) {
        return this.value;
    }

    @Override
    public T getOrElseSupply(Supplier<? extends T> supplier) {
        return this.value;
    }

    @Override
    public <X extends Throwable> T getOrElseThrow(Supplier<? extends X> exceptionSupplier) throws X {
        return this.value;
    }

    @Override
    public <E extends Throwable> Try<T> onSuccess(ThrowableConsumer<T, E> action) throws E {
        action.accept(this.value);
        return this;
    }

    @Override
    public <E extends Throwable> Try<T> onFailure(ThrowableConsumer<Throwable, E> action) throws E {
        return this;
    }

    @Override
    public Try<T> filter(Predicate<T> predicate) {
        if (!predicate.test(this.value)) {
            return new Failure<>(new NoSuchElementException());
        }
        return this;
    }

    @Override
    public <U> Try<U> map(ThrowableFunction<? super T, ? extends U> function) {
        return null;
    }

    @Override
    public <U> Try<U> flatMap(ThrowableFunction<? super T, Try<U>> function) {
        return null;
    }

    @Override
    public Try<T> recover(ThrowableFunction<? super Throwable, T> function) {
        return null;
    }

    @Override
    public Try<T> recoverWith(ThrowableFunction<? super Throwable, Try<T>> function) {
        return null;
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
