package com.java_learning.lesson_7;

public class FoodBag {
    private int volFoodBag;

    public FoodBag (int volFoodBag){
        this.volFoodBag = volFoodBag;
    }

    public int getVolFoodBag(){
        return volFoodBag;
    }

    public void setVolFoodBag(int volFoodBag){
        this.volFoodBag = volFoodBag;
    }

        public String printVolFoodBag() {
        return "Объём пакета с кормом составляет " + volFoodBag + " грамм";
    }

    public void infoVolFoodBag(){
        System.out.println(this);
    }
}
