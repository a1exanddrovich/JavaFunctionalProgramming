package com.stepik.course.tasks.t7_2;

import java.util.Optional;

/**
 * Represents the result of a computation that could have succeeded with a value of the type T
 * or failed with a Throwable.
 */
public interface Try<T> {

    /**
     * Executes the given operation and returns the result wrapped in a Success or Failure
     */
    static <T> Try<T> of(ThrowableOperation<T> operation) {

    }

    /**
     * Returns true if the original operation succeeded, otherwise returns false
     */
    boolean isSuccess();

    /**
     * Returns the resulting value if this is a Success, otherwise throws the original exception
     */
    T get() throws Throwable;

    /**
     * Returns the resulting value if this is a Success,
     * otherwise throws the original exception wrapped in a RuntimeException
     *
     * @throws RuntimeException that wraps the original exception
     */
    T getUnchecked();

    /**
     * Converts this to a non-empty Optional that wraps the resulting value if this is Success,
     * otherwise returns an empty Optional
     */
    Optional<T> toOptional();

}
