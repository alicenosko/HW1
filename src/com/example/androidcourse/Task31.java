package com.example.androidcourse;
import java.util.Scanner;

/**  Задача 3.1 Найти максимальное из четырех введеных чисел*/
public class Task31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int max = Integer.max(a > b ? a : b, c > d ? c : d);// с помощью тернарного оператора
        System.out.println("Max element: " + max);
    }
}
