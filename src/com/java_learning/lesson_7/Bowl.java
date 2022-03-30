package com.java_learning.lesson_7;

public class Bowl {
    private int volAnimalBowl;

    public Bowl(int volAnimalBowl) {
        this.volAnimalBowl = volAnimalBowl;
    }

    public int getVolAnimalBowl() {
        return volAnimalBowl;
    }

    public void setVolAnimalBowl(int volAnimalBowl) {
        this.volAnimalBowl = volAnimalBowl;
    }


    public void fillBowlCats(FoodBag foodBag) {
        foodBag.fillBowl(volAnimalBowl);
    }

    public String infoFullVolAnimalBowl() {
        return "Миска вмещает " + volAnimalBowl + " грамм корма";
    }

    public String infoBowlFilling(){
        return "Миска наполнена на " + volAnimalBowl + " грамм";
    }

}
