package com.example.androidcourse;

import java.util.Scanner;

/**
 *  Задача  2.2. Вычилить процент А% от числа X. Числа А, X вводятся с клавиатуры.
  * */
public class Task22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter А%: ");
        double a = in.nextInt();
        System.out.println("Enter X: ");
        double x = in.nextInt();
        double z = a*x/100;//
        System.out.println("Answer: " + z);
    }
}
