package com.java_learning.lesson_7;

public class Bowl {
    private int volAnimalBowl;

    public Bowl(int volAnimalBowl) {
        this.volAnimalBowl = volAnimalBowl;
    }

    public int getVolAnimalBowl() {
        return volAnimalBowl;
    }

    public void fillBowlCats(FoodBag foodBag) {
        foodBag.fillBowl(volAnimalBowl);
    }

    public void mountFoodEaten(int mountFoodEatCat){
        if (volAnimalBowl >= mountFoodEatCat){
            volAnimalBowl = volAnimalBowl - mountFoodEatCat;
        } else {
            System.out.println("Объём корма в миске не может быть меньше требуемого корма коту");
        }
    }

    public String infoFullVolAnimalBowl() {
        return "Миска вмещает " + this.volAnimalBowl + " грамм корма";
    }


    public String infoBowlFilling(){
        return "Миска наполнена на " + volAnimalBowl + " грамм";
    }

}
