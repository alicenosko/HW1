package com.example.androidcourse;

import java.util.Scanner;

/**
* Задача 4.2. Найти факториал от вводимого числа
* */
public class Task42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = in.nextInt();
        if (a<0) {
            System.out.println("No solutions.The factorial is a function defined on the set of nonnegative integers.");
        }
        else{
        factorial(a);}
    }

    public static void factorial(int n) {
        long y = 1;
        for (int i = 1; i <= n; i++) {
            y =(long) y * i;
        }
        System.out.print(n + "!=" + y);
    }
}
