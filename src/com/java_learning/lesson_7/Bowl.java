package com.java_learning.lesson_7;

import java.util.Objects;
import java.util.Scanner;

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
            System.out.println("Объём пакета с кормом составляет " + foodBag.getVolFoodBag() + " грамм; Миска наполнена на " + volAnimalBowl + " грамм.");
            addFood(foodBag);
        }
    }

    public void addFood(FoodBag foodBag){
        Scanner scanner = new Scanner(System.in);
        String response;
        int addFood;
        int addVolFood;
        System.out.print("Пополнить запас корма? Y / N: ");
        response = scanner.next();
        if (Objects.equals(response, "Y") || Objects.equals(response, "y")) {
            System.out.print("Введите объем добавки: ");
            addFood = scanner.nextInt();
            addVolFood = foodBag.getVolFoodBag() + addFood;
            foodBag.setVolFoodBag(addVolFood);
            foodBag.fillBowl(volAnimalBowl);
        }
        else {
            volAnimalBowl = 0;
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
