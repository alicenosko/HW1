package com.example.androidcourse;

import java.util.Scanner;

/**
* Задача 2.3. Вычислить корни квадратного уравнения ax^2+bx+c=0. Числа А, Х вводятся с клавиатуры.
*
*/
public class Task23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = in.nextInt();
        System.out.println("Enter b: ");
        double b = in.nextInt();
        System.out.println("Enter c: ");
        double c = in.nextInt();
        System.out.println(a + "x^2+ " + b + "x + " + c + " = 0");
        double d = Math.sqrt(b * b - 4 * a * c);

        if (d > 0) {
            double x1 = (-b - d) / (2 * a);
            double x2 = (-b + d) / (2 * a);
            System.out.println("First root: " + x1 + " Second root: " + x2);
        } else {
            if (d == 0) {
                double x = (-b) / (2 * a);
                System.out.println("Root: " + x);
            } else {
                System.out.println("No solution");
            }
        }
    }
}
