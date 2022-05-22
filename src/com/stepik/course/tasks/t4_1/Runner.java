package com.stepik.course.tasks.t4_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner {

    public static void main(String[] args) {

        Map<String, Integer> companyToNumberOfEmployeesMap = new HashMap<>();

        companyToNumberOfEmployeesMap.put("Goods Inc", 550);
        companyToNumberOfEmployeesMap.put("BestDevStudio", 1200);
        companyToNumberOfEmployeesMap.put("Ggl", 1000000);

        printMap(companyToNumberOfEmployeesMap);

        companyToNumberOfEmployeesMap.merge("NewTest", 20, Integer::sum);
        companyToNumberOfEmployeesMap.merge("Goods Inc", 50, Integer::sum);

        printMap(companyToNumberOfEmployeesMap);
        companyToNumberOfEmployeesMap.compute("Ggl", (company, amountOfEmployees) -> (int) (amountOfEmployees * 0.8));

        printMap(companyToNumberOfEmployeesMap);

        companyToNumberOfEmployeesMap.computeIfPresent("BestDevStudio", (company, amountOfEmployees) -> amountOfEmployees += 200);

        printMap(companyToNumberOfEmployeesMap);


        PhoneBook phoneBook = new PhoneBook();

        List<PhoneNumber> claraPhoneNumbers = new ArrayList<>();
        claraPhoneNumbers.add(new PhoneNumber(PhoneNumberType.HOME, "723324324"));
        phoneBook.addNewPhoneNumbers("Clara", claraPhoneNumbers);

        List<PhoneNumber> kevinPhoneNumbers = new ArrayList<>();
        kevinPhoneNumbers.add(new PhoneNumber(PhoneNumberType.WORK, "1231"));
        phoneBook.addNewPhoneNumbers("Kevin", kevinPhoneNumbers);

        phoneBook.addNewPhoneNumbers("Clara", List.of(new PhoneNumber(PhoneNumberType.MOBILE, "23424279")));
        phoneBook.addNewPhoneNumbers("Paul", List.of(new PhoneNumber(PhoneNumberType.WORK, "56756335")));

        phoneBook.printPhoneBook();


    }

    private static void printMap(Map<String, Integer> companyToNumberOfEmployeesMap) {
        System.out.println(companyToNumberOfEmployeesMap);
    }

}
