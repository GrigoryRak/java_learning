package com.java_learning.lesson_7;

public class Bowl {
    private int volAnimalBowl;

    public Bowl(int volAnimalBowl) {
        this.volAnimalBowl = volAnimalBowl;
    }

    public int getVolAnimalBowl() {
        return volAnimalBowl;
    }

    //    Пополнение миски
    public void fillBowlCats(FoodBag foodBag) {
        if (foodBag.getVolFoodBag() >= volAnimalBowl) {
            foodBag.fillBowl(volAnimalBowl);
        } else {
            volAnimalBowl = 0;
            System.out.println("Объем в мешке " + foodBag.getVolFoodBag() + " грамм; Миска пополнена на " + volAnimalBowl + " грамм. Пополни запас корма.");
        }
    }

    //    Сколько корма потребляет животное
    public void mountFoodEaten(int mountFoodEatCat) {
        volAnimalBowl = volAnimalBowl - mountFoodEatCat;
    }

    public String infoFullVolAnimalBowl() {
        return "Миска вмещает " + this.volAnimalBowl + " грамм корма";
    }

}
