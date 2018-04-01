package com.example.androidcourse;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Задача 5.3.
 * С клавиатуры ввести два числа. Сгенерировать, вывести массив из случайных чисел в диапахоне, задаваемом введенными двумя числами.
 */
public class Task53 {
    private static Random rand = new Random();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = in.nextInt();
        System.out.println("Enter b: ");
        int b = in.nextInt();
        int mas[] = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = getRandom(a, b);
            System.out.print((mas[i] + " "));
        }

    }

    public static int getRandom(int x, int y) {
        return x + (int) (Math.random() * ((y - x) + 1));

        //x + rand.nextInt(y - x + 1);
    }
}
