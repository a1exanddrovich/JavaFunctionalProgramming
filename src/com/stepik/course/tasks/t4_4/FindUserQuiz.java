package com.stepik.course.tasks.t4_4;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class FindUserQuiz {

    public static Optional<User> findUserByAccountId(Set<User> users, String id) {
        return users
                .stream()
                .filter(user -> user.getAccount().isPresent())
                .filter(user -> user.getAccount().get().getId().equals(id))
                .findAny();
    }

    public static void main(String[] args) {
        Account account1 = new Account("Account1");
        Account account2 = new Account("Account2");
        Account account3 = new Account("Account3");
        Set usersSet = new HashSet();
        usersSet.add(new User("User1", account1));
        usersSet.add(new User("User2", account2));
        usersSet.add(new User("User3", account3));
        System.out.println(FindUserQuiz.findUserByAccountId(usersSet, "Account1"));//return Optional user object
        System.out.println(FindUserQuiz.findUserByAccountId(usersSet, "Account22"));//return Optional.empty
    }

}
