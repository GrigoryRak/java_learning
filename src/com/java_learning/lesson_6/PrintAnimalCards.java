package com.java_learning.lesson_6;

//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
// Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//4. * Добавить подсчет созданных котов, собак и животных.

public class PrintAnimalCards {

    public static void main(String[] args) {

//        Animals[] animalArray = new Animals[10];

        Cat catTom = new Cat("Tom", "Run", "Yes");
        Cat catJerry = new Cat("Jerry", "Swim", "Yes");
        Cat catMax = new Cat("Max", "Swim", "No");
        Cat catAlex = new Cat("Alex", "Run", "Yes");
        Cat catCat = new Cat("Cat", "Run", "No");
        Dog dogSharik = new Dog("Sharick", "Swim", "Yes");
        Dog dogBobik = new Dog("Bobik", "Run", "No");
        Dog dogFredy = new Dog("Fredy", "Swim", "No");
        Dog dogIvan = new Dog("Ivan", "Run", "Yes");
        Dog dogShrek = new Dog("Shrek", "Swim", "Yes");
        
        catTom.setPathLongMax(100);
        System.out.println(catTom.printAnimalCard());

    }

}
