package com.example.androidcourse;

import java.util.Scanner;

/**
 * Задача 4.8. Найти при помощи алгоритма Евклида НОД двух вводимых чисел.
 */
public class Task48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First number a: ");
        int a = in.nextInt();
        System.out.println("Enter Second number b: ");
        int b = in.nextInt();
        algEuclid(a, b);
    }

    public static void algEuclid(int x, int y) {

        while (x != 0 && y != 0) {
            if (x > y) {
                x = x % y;
            } else
                {
                y = y % x;
            }

        }
        System.out.println("NOD: " + (x + y));

    }
}
