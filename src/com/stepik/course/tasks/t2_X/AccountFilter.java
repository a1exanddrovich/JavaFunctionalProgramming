package com.stepik.course.tasks.t2_X;

import java.util.List;
import java.util.stream.Collectors;

public class AccountFilter {

    List<Account> filterNonEmptyAccounts(List<Account> accounts) {
        return accounts.stream().filter(account -> account.getBalance() > 0).collect(Collectors.toList());
    }

    List<Account> filterRichNonBlockedAccounts(List<Account> accounts, Integer richMarkerSum) {
        return accounts.stream().filter(account -> !account.isLocked() && account.getBalance() >= richMarkerSum).collect(Collectors.toList());
    }


}
