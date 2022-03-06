package com.java_learning.lesson_3;

import java.util.Arrays;

public class Lesson_3 {
    public static void main(String[] args) {
        arrayExample();
        System.out.println();
        System.out.println("Заполнение массива числами с 1 до 100:");
        arrayFilling();
        System.out.println();
        System.out.println("Числа < 6 умножить на 2:");
        numSubstitutionArray();
        System.out.println();
        System.out.println("Двумерный массив заполнить 1-ми по диагоналям:");
        multiArray(10);
        System.out.println();
        System.out.println("Метод, принимающий на вход два аргумента: len и initialValue: ");
        arrayInt(5, 15);
        System.out.println();
        System.out.println("Задать одномерный массив и найти в нем минимальный и максимальный элементы: ");
        arrayMaxAndMin();
        System.out.println();
        System.out.println("Сумма правой и левой части массива равны: " + comparisonArray());
        System.out.println();
        System.out.println("Массим со смещением: ");
        arrayOffset(new int[]{1, 3, 4, 5, 6}, 1);
    }

    public static void arrayExample() {
        System.out.println("Первоначальный массив: ");
        int[] data = {0, 0, 1, 0, 0, 1, 0, 1};
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println("Массив с заменой: ");
        for (int j = 0; j < data.length; j++) {
            int value = data[j];
            if (value == 0) {
                data[j] = 1;
            } else {
                data[j] = 0;
            }
            System.out.print(data[j] + " ");
        }
        System.out.println();
    }

    public static void arrayFilling() {
        int[] data = new int[100];
        for (int i = 0; i < data.length; i++) {
            data[i] = i + 1;
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void numSubstitutionArray() {
        int[] data = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < data.length; i++) {
            int value = data[i];
            if (value < 6) {
                data[i] = value * 2;
            }
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void multiArray(int size) {
        int[][] data = new int[size][size]; // 3 строки
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                data[i][j] = (i == j) || (i + j == size - 1) ? 1 : 0;
                System.out.print(data[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void arrayInt(int len, int initialValue) {
        int[] data = new int[len];
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] = initialValue);
        }
    }

    public static void arrayMaxAndMin() {
        int[] data = {10, 100, 1032, 0, 4, 5, 213, -234, -1, 0, 8, 3};
        Arrays.sort(data);
        System.out.println("Максимальное значение массива: " + data[data.length - 1]);
        System.out.println("Минимальное значение массива: " + data[0]);
    }

    public static boolean comparisonArray() {
        int[] data = {1, 2, 3, 4, 6, 10, 5, 21};
        int firstResult = 0;
        int secondResult = 0;
        for (int i = 0; i <= (data.length - 1) - 2; i++) {
            firstResult = firstResult + data[i];
        }
        for (int i = (data.length - 2); i < data.length; i++) {
            secondResult = secondResult + data[i];
        }
        return firstResult == secondResult;
    }

    public static void arrayOffset(int[] data, int pos){
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + "  ");
            System.out.println();
        }
    }

}
