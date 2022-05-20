package com.stepik.course.tasks;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        int result = substitution(n, digit -> digit > 4 ? digit - 4 : digit);

        String sender = scanner.nextLine();
        String receiver = scanner.nextLine();
        String signature = scanner.nextLine();


        Function<String, String> emailFormatter = text -> sender + "|" + receiver + "|" + text + "|" + signature;

        System.out.println(emailFormatter.apply(scanner.nextLine()));
        System.out.println(result);

    }

    public static int substitution(long n, Function<Integer, Integer> digitRule) {
        String numberAsString = String.valueOf(n);
        int result = 0;

        for (int i = 0; i < numberAsString.length(); i++) {
            result *= 10;
            int nextDigit = Integer.parseInt(String.valueOf(numberAsString.charAt(i)));
            result += digitRule.apply(nextDigit);
        }

        return result;
    }

}
