package com.java_learning.lesson_7;

public class FoodBag {
    private int volFoodBag;

    public FoodBag(int volFoodBag) {
        this.volFoodBag = volFoodBag;
    }

    public int getVolFoodBag() {
        return volFoodBag;
    }

    public void setVolFoodBag(int volFoodBag) {
        this.volFoodBag = volFoodBag;
    }

    //    Пополнение миски, проверка на корма в мешке
    public void fillBowl(int mount) {
        if (volFoodBag >= mount) {
            volFoodBag = volFoodBag - mount;
        } else {
            System.out.println("Недостаточно корма, остаток: " + this.volFoodBag + " грамм.");
        }
    }

    //    Объем пакета с кормом
    public String infoFullVolFoodBag() {
        return "Объём пакета с кормом составляет " + volFoodBag + " грамм";
    }

}
