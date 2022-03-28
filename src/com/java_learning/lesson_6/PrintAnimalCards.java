package com.java_learning.lesson_6;

public class PrintAnimalCards {

    public static void main(String[] args) {

        Cat catTom = new Cat("Tom", 50, 0);
        Dog dogSharik = new Dog("Sharick", 500, 200);

        System.out.println(catTom.printAnimalCard());
        System.out.println("------ Кошки------");
        System.out.println("------ Тестирование животного на бег------");
        catTom.setCheckSkillRun(10);
        System.out.println(catTom.printCatRun());
        System.out.println("------ Тестирование животного на заплыв------");
        catTom.setCheckSkillSwim(1);
        System.out.println(catTom.printCatSwim());

        System.out.println();
        System.out.println(dogSharik.printAnimalCard());
        System.out.println("------ Собаки------");
        System.out.println("------ Тестирование животного на бег------");
        dogSharik.setCheckSkillRun(10);
        System.out.println(dogSharik.printDogRun());
        System.out.println("------ Тестирование животного на заплыв------");
        dogSharik.setCheckSkillSwim(1);
        System.out.println(dogSharik.printDogSwim());
    }

}