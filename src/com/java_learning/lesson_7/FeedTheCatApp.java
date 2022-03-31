package com.java_learning.lesson_7;

/**
 1. Расширить задачу про котов и тарелки с едой.
 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
 4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
 5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
 **/

public class FeedTheCatApp {
    public static void main(String[] arg){
        Cats cats = new Cats(100, "Вася");
        Cats cats2 = new Cats(300, "Барсик");
        Cats cats3 = new Cats(190, "Фифа");
        Cats cats4 = new Cats(190, "Кекс");
        FoodBag foodBag = new FoodBag(510);
        Bowl bowl = new Bowl(100);

        System.out.println(cats.printVolFoodEaten());
        System.out.println(foodBag.infoFullVolFoodBag());
        System.out.println((bowl.infoFullVolAnimalBowl()));
        System.out.println("------------------------------------------------------------");

        bowl.fillBowlCats(foodBag);
        cats.eatFoodCat(bowl);
        cats2.eatFoodCat(bowl);
        cats3.eatFoodCat(bowl);
        cats4.eatFoodCat(bowl);
        bowl.fillBowlCats(foodBag);
    }
}
