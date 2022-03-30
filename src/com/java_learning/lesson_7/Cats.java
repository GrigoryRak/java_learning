package com.java_learning.lesson_7;

public class Cats extends Animals {

    private final String name;

    public Cats(int volFoodEaten, String name) {
        super(volFoodEaten);
        this.name = name;
    }

    public void eatFoodCat(Bowl bowl) {
        if(bowl.getVolAnimalBowl() >= super.getVolFoodEaten()){
            bowl.mountFoodEaten(super.getVolFoodEaten());
            System.out.println("Кот " + this.name + " съел " + super.getVolFoodEaten() + " грамм, в миске осталось " + bowl.getVolAnimalBowl() + " грамм");
        } else
        {
            System.out.println("Кот " + this.name + " отсался голодным");
        }
    }

}
