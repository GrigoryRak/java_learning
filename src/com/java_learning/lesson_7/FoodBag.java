package com.java_learning.lesson_7;

public class FoodBag {
    private int volFoodBag;

    public FoodBag(int volFoodBag) {
        this.volFoodBag = volFoodBag;
    }

    public int getVolFoodBag() {
        return volFoodBag;
    }

    public void fillBowl(int mount){
       this.volFoodBag = this.volFoodBag - mount;
    }

    public String infoFullVolFoodBag() {
        return "Объём пакета с кормом составляет " + volFoodBag + " грамм";
    }

    public String infoBalanceVolFoodBag(){
        return "Остаток корма после кормешки животного " + volFoodBag + " грамм";
    }

}
