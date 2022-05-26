package com.stepik.course.tasks.tX;

@FunctionalInterface
public interface Retry {

    int run(Runnable action, int maxAttempts, long delayBeforeRetryMs);

}
