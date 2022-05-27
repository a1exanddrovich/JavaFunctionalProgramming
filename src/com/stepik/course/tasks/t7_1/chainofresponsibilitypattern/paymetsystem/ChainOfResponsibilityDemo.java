package com.stepik.course.tasks.t7_1.chainofresponsibilitypattern.paymetsystem;

import java.security.MessageDigest;
import java.util.Base64;

public class ChainOfResponsibilityDemo {

    /**
     * Accepts a request and returns new request with data wrapped in the tag <transaction>...</transaction>
     */
    static RequestHandler wrapInTransactionTag = req ->
            new Request(String.format("<transaction>%s</transaction>", req.getData()));

    /**
     * Accepts a request and returns a new request with calculated digest inside the tag <digest>...</digest>
     */
    static RequestHandler createDigest = req -> {
        String digest = "";
        try {
            final MessageDigest md5 = MessageDigest.getInstance("MD5");
            final byte[] digestBytes = md5.digest(req.getData().getBytes("UTF-8"));
            digest = new String(Base64.getEncoder().encode(digestBytes));
        } catch (Exception ignored) {
            System.out.println("An error occurred");
        }
        return new Request(req.getData() + String.format("<digest>%s</digest>", digest));
    };

    /**
     * Accepts a request and returns a new request with data wrapped in the tag <request>...</request>
     */
    static RequestHandler wrapInRequestTag = req ->
            new Request(String.format("<request>%s</request>", req.getData()));

    /**
     * It should represent a chain of responsibility combined from another handlers.
     * The format: commonRequestHandler = handler1.setSuccessor(handler2.setSuccessor(...))
     * The combining method setSuccessor may have another name
     */

    //<request><transaction>Functional programming</transaction><digest>CpQDwJPMyHN+uqjXXPxKRQ==</digest></request>
    //<transaction><request>Functional programming</request><digest>e/vAQHzTXbY8jsX8xSJGkg==</digest></transaction>
    public static RequestHandler commonRequestHandler = wrapInRequestTag.andThenHandle(createDigest.andThenHandle(wrapInTransactionTag));

}
