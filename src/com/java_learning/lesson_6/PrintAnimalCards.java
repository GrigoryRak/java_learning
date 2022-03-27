package com.java_learning.lesson_6;

//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
// Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//4. * Добавить подсчет созданных котов, собак и животных.

public class PrintAnimalCards {

    public static void main(String[] args) {

//        Animals[] animalArray = new Animals[10];

        Cat catTom = new Cat("Tom", 50, 0);
        Cat catJerry = new Cat("Jerry", 100, 50);
        Cat catMax = new Cat("Max", 0, 20);
        Dog dogSharik = new Dog("Sharick",500, 200);
        Dog dogBobik = new Dog("Bobik",  0, 10);
        Dog dogFredy = new Dog("Fredy", 700, 600);


        System.out.println(catTom.printAnimalCard());
        System.out.println("------ Кошки------");
        System.out.println("------ Тестирование животного на бег------");
        catTom.setCheckSkillRun(10);
        System.out.println(catTom.printCatRun());
        System.out.println("------ Тестирование животного на заплыв------");
        catTom.setCheckSkillSwim(0);
        System.out.println(catTom.printCatSwim());

        System.out.println();
        System.out.println("------ Собаки------");
        System.out.println("------ Тестирование животного на бег------");
        dogSharik.setCheckSkillRun(10);
        System.out.println(dogSharik.printDogRun());
        System.out.println("------ Тестирование животного на заплыв------");
        dogSharik.setCheckSkillSwim(1);
        System.out.println(dogSharik.printDogSwim());

    }

}
