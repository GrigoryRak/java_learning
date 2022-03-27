package com.java_learning.lesson_6;

//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
// Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//4. * Добавить подсчет созданных котов, собак и животных.

public class PrintAnimalCards {

    public static void main(String[] args) {

//        Animals[] animalArray = new Animals[10];

        Cat catTom = new Cat("Tom", 0, 0);
//        Cat catJerry = new Cat("Jerry", "Swim", "Yes", 5);
//        Cat catMax = new Cat("Max", "Swim", "No", 0);
//        Cat catAlex = new Cat("Alex", "Run", "Yes", 50);
//        Cat catCat = new Cat("Cat", "Run", "Yes", 60);
//        Dog dogSharik = new Dog("Sharick", "Swim", "Yes", 300);
//        Dog dogBobik = new Dog("Bobik", "Run", "No", 0);
//        Dog dogFredy = new Dog("Fredy", "Swim", "No", 0);
//        Dog dogIvan = new Dog("Ivan", "Run", "Yes", 500);
//        Dog dogShrek = new Dog("Shrek", "Swim", "Yes", 600);


        System.out.println(catTom.printAnimalCard());
        System.out.println("------ Тестирование животного на бег------");
        catTom.setMaxSkillRun(12);
        System.out.println(catTom.printCatRun());
        System.out.println("------ Тестирование животного на заплыв------");
        catTom.setMaxSkillSwim(1);
        System.out.println(catTom.printCatSwim());

    }

}
