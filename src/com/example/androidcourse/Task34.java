package com.example.androidcourse;
/**
Задача 3.4.Написать программу, которая позволит ввести два числа с клавиатуры и знак арифметической операции, и вывести результат треугольника
 */

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = in.nextInt();
        System.out.println("Enter sign: ");
        String c = in.next();
        System.out.println("Enter b: ");
        int b = in.nextInt();
        double d = 0;
        switch (c) {
            case "+":
                d = (double) a + b;
                break;
            case "-":
                d = (double) a - b;
                break;
            case "*":
                d = (double) a * b;
                break;
            case "/":
                d = (double) a / b;
                break;
            default:
                System.out.println("Symbol ne naiden");
                break;
        }

        System.out.println("Result: " + d);
    }

}
