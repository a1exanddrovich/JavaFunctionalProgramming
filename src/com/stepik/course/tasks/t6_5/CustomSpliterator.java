package com.stepik.course.tasks.t6_5;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class CustomSpliterator implements Spliterator<Integer> {

    private final List<Integer> numbers;
    private int start;
    private int end;

    public CustomSpliterator(List<Integer> numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean tryAdvance(Consumer<? super Integer> action) {
        if (start <= end) {
            action.accept(numbers.get(start++));
            return true;
        }
        return false;
    }

    @Override
    public Spliterator<Integer> trySplit() {
        if (estimateSize() < 1000) {
            return null;
        }
        int middleIndex = (end - start) / 2;
        int previousStart = start;
        start = middleIndex;
        return new CustomSpliterator(numbers, previousStart, middleIndex);
    }

    @Override
    public long estimateSize() {
        return end - start + 1;
    }

    @Override
    public int characteristics() {
        return ORDERED | SIZED | SUBSIZED;
    }

}
