package com.example.androidcourse;

/**
 * Задача 5.4. Выяснит, является ли введенное число палиндромом
 */
public class Task54 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 4, 3, 2, 1};
        boolean isPolindrom = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != a[a.length - i - 1]) {
                isPolindrom = false;
                break;
            }
        }
        System.out.println(isPolindrom ? "This is polindrom " : " This is not polindrom");
    }
}
