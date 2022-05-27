package com.stepik.course.tasks.t7_1.strategypattern.encoding;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Base64;

public class Main2 {

    public static void main(String[] args) {
        byte[] data = "Some data :)".getBytes();

        //first
        Encoder base64Encoder = new Encoder(new Base64Strategy());
        Encoder hexEncoder = new Encoder(new HexStrategy());
        Encoder utfEncoder = new Encoder(new UTFStrategy());

        //second
        Encoder firstBase64Encoder = new Encoder(dataToEncode -> Base64.getEncoder().encodeToString(dataToEncode));
        Encoder firstHexEncoder = new Encoder(dataToEncode -> new BigInteger(1, dataToEncode).toString(16));
        Encoder firstUtfEncoder = new Encoder(dataToEncode -> Arrays.toString(dataToEncode));

        //third
        Encoder thirdBase64Encoder = new Encoder(Base64.getEncoder()::encodeToString);
        Encoder thirdUtfEncoder = new Encoder(Arrays::toString);


        base64Encoder.printEncoded(data);
        hexEncoder.printEncoded(data);
        utfEncoder.printEncoded(data);
    }

}
