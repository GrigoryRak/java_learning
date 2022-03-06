package com.java_learning.lesson_2;

import java.util.*;

public class HomeWorkMethod {

    static GregorianCalendar leapYear = new GregorianCalendar();

    public static void main(String[] args) {
        System.out.println("Сумма чисел a и b лежит в диапазоне от 10 до 20 (включительно) - " + checkSum(5,10));
        System.out.println();
        numberCheck(-5);
        System.out.println();
        System.out.println("Верно ли, что введено отрицательное число? Результат: " + numberCheckBool(-1));
        System.out.println();
        cycle("Проход по циклу - ", 7);
        System.out.println();
        int year = 2032;
        System.out.println("Определяем тип " + year + " года. Год является високосным? Результат: " + definitionLeapYear(year));
    }

    public static boolean checkSum(int a, int b){
        int summa = a + b;
        return summa >= 10 && summa <= 20;
    }

    public static void numberCheck(int a){
        if (a >=0) {
            System.out.println(a + " - является числом положительным;");
        } else {
            System.out.println(a + " - является числом отрицательным;");
        }
    }

    public static boolean numberCheckBool(int a){
        return a < 0;
    }

    public static String cycle(String a, int b){
        for(int i = 1; i <= b; i++){
            System.out.println(a + i);
        }
        return a;
    }

    public static boolean definitionLeapYear(int year){
        return leapYear.isLeapYear(year);
    }

}
