package com.stepik.course.tasks.t4_3;

import java.util.function.Consumer;
import java.util.function.Function;

public class Calculator<T> {

    private static final Calculator<?> BROKEN_CALCULATOR = new Calculator<>(true);

    private final T value;
    private final boolean hasError;

    private Calculator(T value) {
        this.value = value;
        this.hasError = false;
    }

    private Calculator(boolean hasError) {
        this.value = null;
        this.hasError = hasError;
    }

    @SuppressWarnings("unchecked")
    private static <T> Calculator<T> getBrokenCalculator() {
        return (Calculator<T>) BROKEN_CALCULATOR;
    }

    public static <T> Calculator<T> of(T value) {
        try {
            if (value != null) {
                return new Calculator<>(value);
            }
        } catch (Exception e) {
            return getBrokenCalculator();
        }
        return getBrokenCalculator();
    }

    public <U> Calculator<U> eval(Function<T, U> mapper) {
        if (!this.hasError && mapper != null) {
            try {
                return new Calculator<>(mapper.apply(this.value));
            } catch (Exception e) {
                return getBrokenCalculator();
            }
        }
        return getBrokenCalculator();
    }

    public Calculator<T> consume(Consumer<T> consumer) {
        if (!this.hasError && consumer != null && value != null) {
            try {
                consumer.accept(this.value);
                return new Calculator<>(value);
            } catch (Exception e) {
                return getBrokenCalculator();
            }
        }
        return getBrokenCalculator();
    }

}
