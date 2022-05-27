package com.stepik.course.tasks.t7_1.strategypattern.encoding;

public class Encoder {

    private final EncodingStrategy encodingStrategy;

    public Encoder(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }

    public void printEncoded(byte[] data) {
        if (data.length == 0) {
            throw new IllegalArgumentException("No data to encode");
        }

        String encodedData = encodingStrategy.encode(data);
        System.out.println(encodedData);
    }

}
