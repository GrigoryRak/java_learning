package com.java_learning.lesson_7;

public class FeedTheCatApp {

    private static final int COUNT_ANIMALS = 7;

    public static void main(String[] arg) {

        FoodBag foodBag = new FoodBag(1000);
        Bowl bowl = new Bowl(500);

        System.out.println(foodBag.infoFullVolFoodBag());
        System.out.println((bowl.infoFullVolAnimalBowl()));
        System.out.println("------------------------------------------------------------");

//        Наполняем миску кормом
        bowl.fillBowlCats(foodBag);
//        Заполняем массив котами
        Cats[] cats = new Cats[COUNT_ANIMALS];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = createCats(i);
        }

        for (Cats cat : cats) {
            cat.eatFoodCat(bowl);
            System.out.println(cat.printInfoSatiety());
        }
    }

    private static Cats createCats(int i) {
        return new Cats(
                100,
                "Барсик_" + i);
    }
}
