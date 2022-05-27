package com.stepik.course.tasks.t7_1.chainofresponsibilitypattern.paymetsystem;

@FunctionalInterface
public interface RequestHandler {

    Request handle(Request request);

    default RequestHandler andThenHandle(RequestHandler after) {
        return request -> handle(after.handle(request));
    }

}
