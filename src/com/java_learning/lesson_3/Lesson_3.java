package com.java_learning.lesson_3;

public class Lesson_3 {
    public static void main(String[] args){
        arrayExample();
        arrayFilling();
        numSubstitutionArray();
        multiArray();

    }

    public static void arrayExample(){
        System.out.println("Первоначальный массив: ");
        int[] data = {0,0,1,0,0,1,0,1};
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println("Массив с заменой: ");
        for (int j = 0; j < data.length; j++){
            int value = data[j];
            if (value == 0){
                data[j] = 1;
            } else {
                data[j] =0;
            }
            System.out.print(data[j] + " ");
        }
        System.out.println();
    }

    public static void arrayFilling(){
        int[] data = new int[100];
        System.out.println("Заполнение массива числами с 1 до 100:");
        for (int i = 0; i < data.length; i++){
            data[i] = i+1;
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void numSubstitutionArray(){
        System.out.println("Числа < 6 умножить на 2:");
        int[] data = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < data.length; i++){
            int value = data[i];
            if (value < 6){
                data[i] = value * 2;
            }
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void multiArray(){
        System.out.println("Двумерный массив заполнить 1 по диагонали:");
        int[][] data = new int[10][10]; // 3 строки
        for (int i = 0; i < data.length; i++){
            int[] innerData = data[i];
            for (int j = 0; j < innerData.length; j++){
                if (i == j){
                    data[i][j] = 1;
                }
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Диагональ в обратном порядке: ");
        for (int k = data.length - 1; k >= 0; k--){
            int[] innerData = data[k];
            for (int l = innerData.length -1; l >= 0; l--){
                if (k == l){
                    data[k][l] = 1;
                }
                System.out.print(data[k][l] + " ");
            }
            System.out.println();
        }
    }



}
