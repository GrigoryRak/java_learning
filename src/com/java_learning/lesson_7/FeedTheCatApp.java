package com.java_learning.lesson_7;

/**
 * 1. Расширить задачу про котов и тарелки с едой.
 * 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
 * 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
 * 4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
 * 5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
 * 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
 **/

public class FeedTheCatApp {

    private static final int COUNT_ANIMALS = 5;

    public static void main(String[] arg) {
        FoodBag foodBag = new FoodBag(600);
        Bowl bowl = new Bowl(400);

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
