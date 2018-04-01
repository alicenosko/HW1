package com.example.androidcourse;

import java.util.Scanner;

/**
 * Задача 4.6. Для введенного числа N вывести сумму его всех натуральных делителей.
 */
public class Task46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = in.nextInt();
        System.out.println("Divisors of a are ");
        for (int i = a; i > 0; i--) {
            int b = a % i;
            if (b == 0) {
                System.out.print(i + " ");
            }
        }
    }

}
