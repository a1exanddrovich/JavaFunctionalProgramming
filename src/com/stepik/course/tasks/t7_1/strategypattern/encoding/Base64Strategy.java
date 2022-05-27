package com.stepik.course.tasks.t7_1.strategypattern.encoding;

import java.util.Base64;

public class Base64Strategy implements EncodingStrategy {

    @Override
    public String encode(byte[] data) {
        return Base64.getEncoder().encodeToString(data);
    }

}
