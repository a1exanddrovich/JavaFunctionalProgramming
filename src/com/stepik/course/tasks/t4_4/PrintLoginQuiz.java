package com.stepik.course.tasks.t4_4;

import java.util.Optional;
import java.util.Set;

public class PrintLoginQuiz {

    public static void printLoginIfPro(Set<User> users, String id) {

        for (User user : users) {
            user.getAccount().ifPresent(account -> {
                if (account.getType().equals("pro") && account.getId().equals(id)) {
                    System.out.println(user.getLogin());
                }
            });
        }
    }

}
