package com.stepik.course.tasks.t6_2;

import java.util.Scanner;

public class Isogram {

    public static boolean isIsogram(String word) {
        return word.length() == word.codePoints().distinct().count();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        System.out.println(isIsogram(word));
    }

}
