package com.stepik.course.tasks.t4_2;

import java.util.Comparator;

public class Account {

    private final String owner;
    private final long balance;
    private final boolean locked;

    public Account(String owner, long balance, boolean locked) {
        this.owner = owner;
        this.balance = balance;
        this.locked = locked;
    }

    public String getOwner() {
        return owner;
    }

    public long getBalance() {
        return balance;
    }

    public boolean isLocked() {
        return locked;
    }

    public static Comparator<Account> getComparatorByLockedBalanceAndOwner() {
        return Comparator
                .comparing(Account::isLocked)
                .thenComparing(Account::getBalance, Comparator.reverseOrder())
                .thenComparing(Account::getOwner);
    }

}
