package com.example.androidcourse;

import java.util.Scanner;

/**
 * Задача 45. Выяснить является ли введенное число простым или нет.
 */
public class Task45 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = in.nextInt();
        if (isCheck(a)) {
            System.out.println(a + " is prime number");
        } else {
            System.out.println(a+ " is composite number");
        }
    }

    public static boolean isCheck(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
