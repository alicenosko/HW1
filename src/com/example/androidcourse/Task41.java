package com.example.androidcourse;

import java.util.Scanner;

/**
* Задача 4.1. Вывести k-ое число Фибоначчи. Число k вводится с клавиатуры.
* Алгоритм
*Ввести два начальных значения ряда (fib1 и fib2).
*Ввести номер определяемого элемента.
*Выполнять нижеследующие действия количество раз, равное по величине номеру определяемого элемента, уменьшенному на две единицы (т.к. первое и второе значение ряда уже известны).
*Сложить fib1 и fib2, присвоив результат третьей переменной (fib_sum).
*Поменять начальные значения: fib1 = fib2, а fib2 = fib_sum
* */
public class Task41 {
    public static void main(String[] args) {
        long fib1 = 1;
        long fib2 = 1;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter k, which you want known: ");
        int k = in.nextInt();
        int i = 2;
        while (i < k) {
            long fibSum = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibSum;
            i++;
            System.out.println("Answer: " + fibSum);
        }

    }
}
