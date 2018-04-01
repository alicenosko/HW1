package com.example.androidcourse;
/**Задача 3.3. Выяснить, могут ли три введенных числа с клавиатуры быть сторонами какого-либо треугольника*/
import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter sideA: ");
        int a = in.nextInt();
        System.out.println("Enter sideB: ");
        int b = in.nextInt();
        System.out.println("Enter sideC: ");
        int c = in.nextInt();
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("Triangle exists");
        }
        else {
            System.out.println("Triangle does not exist");
        }


    }
}
