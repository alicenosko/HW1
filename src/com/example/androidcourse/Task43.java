package com.example.androidcourse;
/**Задача 4.3. Вычислить частичную сумму гармонического ряда до n-го члена. Число n вводится с клавиатуры. */
import java.util.Scanner;

public class Task43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = in.nextInt();
        double sum = 0;
        int i = 1;


        while (i <= a) {
            sum +=(double) (1 / i);
            i++;
        }
        System.out.println("SummaHarmon " + sum);
    }
}
