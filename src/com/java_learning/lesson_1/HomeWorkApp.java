package com.java_learning.lesson_1;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void  printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a = 5;
        int b = -10;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

//    В случае, когда значение более 100 описывать как "else if (value > 100)" смысла не имеет, т.к.
//    мы уже имеем полный спект (диапазон) описания значений + во втором условии else if (value > 0 && value <= 100)
//    мы говорим, что в выборку должны попасть значения строго > 0 и <= 100
    public static void printColor(){
        int value = 11;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100){
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers(){
        int a = 10;
        int b = 11;

        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

}
