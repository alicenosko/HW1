package com.example.androidcourse;

/**
 *  Задача  2.1. Арифметические операции. Ввод-вывод
 Вычислить корень линейного уравнения 0 = ax+b, если на вход подаются числа a,b.
 * */

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = in.nextInt();
        System.out.println("Enter b: ");
        int b = in.nextInt();
        double x = (double) -b / a;//
        System.out.println("Answer: " + x);
    }
}

