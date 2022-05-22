package com.stepik.course.tasks.t4_1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PhoneBook {

    private final Map<String, Collection<PhoneNumber>> nameToPhoneNumbersMap = new HashMap<>();

    public void addNewPhoneNumbers(String name, Collection<PhoneNumber> numbers) {
        nameToPhoneNumbersMap.merge(name, numbers, (phoneNumbers, phoneNumbers2) -> {
            phoneNumbers.addAll(phoneNumbers2);
            return phoneNumbers;
        });
    }

    public void printPhoneBook() {
        for (Map.Entry<String, Collection<PhoneNumber>> entry : nameToPhoneNumbersMap.entrySet()) {
            System.out.println(entry.getKey());
            for (PhoneNumber number : entry.getValue()) {
                System.out.println(number.getType() + ": " + number.getNumber());
            }
        }
    }

}
