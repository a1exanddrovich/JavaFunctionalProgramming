package com.stepik.course.tasks.t6_1;

import java.util.stream.Stream;

public class Utils {

    private static int I = 0;

    private Utils() { }

    public static Stream<User> generateUsers(int numberOfUsers) {
        return Stream.generate(() -> new User(I++, String.format("user%d@gmail.com", I++))).limit(numberOfUsers);
    }

}
