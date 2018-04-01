package com.example.androidcourse;

/**
 * Задача 5.2. Вывести массив и вывести на экран произведение самого большого и самошо маленького элементов
 * этого массива.
 */
public class Task52 {
    public static void main(String[] args) {
        int[] mas = {8, 2, 12, 10, 23, 17, 23, 14};
        findMinMax(mas);
    }

    public static void findMinMax(int[] mas) {
        int min = mas[0], max = mas[0];

        for (int i : mas) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println("MAX: " + max + " MIN: " + min);

    }
}
