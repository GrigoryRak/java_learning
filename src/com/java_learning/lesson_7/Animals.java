package com.java_learning.lesson_7;

public class Animals {
    private int volFoodEaten;

    public Animals(int volFoodEaten){
        this.volFoodEaten = volFoodEaten;
    }

    public int getVolFoodEaten(){
        return volFoodEaten;
    }

    public void setVolFoodEaten(int volFoodEaten) {
        this.volFoodEaten = volFoodEaten;
    }

    public String printVolFoodEaten() {
        return "Масса пищи, потребляемая животным составялет " + volFoodEaten + " грамм";
    }
}
