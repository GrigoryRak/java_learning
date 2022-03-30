package com.java_learning.lesson_7;

public class FoodBag {
    private int volFoodBag;

    public FoodBag(int volFoodBag) {
        this.volFoodBag = volFoodBag;
    }

    public void fillBowl(int mount){
        if (this.volFoodBag >= mount || this.volFoodBag == mount){
            this.volFoodBag = this.volFoodBag - mount;
        } else {
            System.out.println("Корма в упаковке меньше, чем необходимо, остаток " + volFoodBag + " грамм");
        }
    }

    public String infoFullVolFoodBag() {
        return "Объём пакета с кормом составляет " + volFoodBag + " грамм";
    }

    public String infoBalanceVolFoodBag(){
        return "Остаток корма в мешке после наполнения миски " + volFoodBag + " грамм";
    }

}
