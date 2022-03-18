package com.java_learning.lesson_3;

import java.util.Scanner;

public class Lesson_Scanner {
    public static void main(String[] args){
        range();
    }

    public static void range() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 10 до 20");
        int number = scanner.nextInt();
        if (number >= 10 && number <=20){
            System.out.println("Число попало в диапазон");
        }
        scanner.close();
    }

}
