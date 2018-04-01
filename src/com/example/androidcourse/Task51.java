package com.example.androidcourse;

/**
 * Задача 5.1. Вывести сумма элментов массива, которые являются чётными и не делятся на 3.
 */
public class Task51 {
    public static void main(String[] args) {
        int mas[] = {7, 4, 10, 6, 9, 14, 2, 12, 8, 5, 17};
        int sum = 0;

        /*for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 3 != 0 && mas[i] % 2 == 0) {
                sum += mas[i];
            }
        }*/

        for (int i : mas)
            if (i % 3 != 0 && i % 2 == 0) {
                sum += i;
            }

        System.out.println(sum);
    }
}

