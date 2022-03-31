package com.java_learning.lesson_7;

public class Cats extends Animals {

    private final String name;
    private boolean satietyLevel;
    private String infoSatiety;

    public Cats(int volFoodEaten, String name) {
        super(volFoodEaten);
        this.name = name;
    }

    public void eatFoodCat(Bowl bowl) {
        if (bowl.getVolAnimalBowl() >= getVolFoodEaten()) {
            bowl.mountFoodEaten(getVolFoodEaten());
            infoSatiety = "Кот " + name + " съел " + getVolFoodEaten() + " грамм, в миске осталось " + bowl.getVolAnimalBowl() + " грамм.";
            satietyLevel = true;
        } else {
            infoSatiety = "Кот " + name + " остался голодным. Не хватает для насыщения " + (getVolFoodEaten() - bowl.getVolAnimalBowl()) + " грамм.";
            satietyLevel = false;
        }
    }

    public boolean isSatietyLevel() {
        return satietyLevel;
    }

    public String printInfoSatiety() {
        return infoSatiety + " Кот насытился: " + isSatietyLevel();
    }

}
