package com.stepik.course.tasks.t7_1.strategypattern.encoding;

import java.util.Arrays;

public class UTFStrategy implements EncodingStrategy {

    @Override
    public String encode(byte[] data) {
        return Arrays.toString(data);
    }

}
