package com.stepik.course.tasks.t7_5;

import java.util.Scanner;
import java.util.function.IntFunction;

public class CurryProduct {

    public static int calc(int x, int y, int z) {
        IntFunction<IntFunction<IntFunction<Integer>>> f = first -> second -> third -> first + second * second + third * third * third;


        return f.apply(x).apply(y).apply(z);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] values = scanner.nextLine().split(" ");

        int x = Integer.parseInt(values[0]);
        int y = Integer.parseInt(values[1]);
        int z = Integer.parseInt(values[2]);

        System.out.println(calc(x, y, z));
    }

}
