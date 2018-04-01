package com.example.androidcourse;

import java.util.Scanner;

/**
* Задача 3.2. C клавиатуры вводится число секунд. Преобразовать это число к форматированному виду: дней, часов, минус, секунд.
*/
public class Task32 {
    public static void main(String[] args) {
        System.out.println("Enter second: ");
        Scanner in = new Scanner(System.in);
        int second = in.nextInt();
        int min = second / 60;
        int secRest = second % 60;
        int hour = min / 60;
        int days = hour / 24;
        System.out.println("A: " + second + " second is: " + min + " full minutes and " + secRest + " seconds.");
        System.out.println("OR");
        System.out.println("B:  " + second + " second is: " + hour + " full hours " + min % 60 + " full minutes and " + secRest + " seconds.");
        System.out.println("OR");
        System.out.println("C: " + second + " second is: " + days + " full days " + hour % 24 + " full hours " + min % 60 + " full minutes and " + secRest + " seconds.");

    }
}
