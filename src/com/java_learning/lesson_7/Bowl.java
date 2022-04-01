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

    // Проверка полноты миски
    public void fillBowlCats(FoodBag foodBag) {
        if (foodBag.getVolFoodBag() >= volAnimalBowl) {
            foodBag.fillBowl(volAnimalBowl);
        } else {
            System.out.println("Объём пакета с кормом составляет " + foodBag.getVolFoodBag() + " грамм; Миска наполнена на " + volAnimalBowl + " грамм.");
            addFood(foodBag);
        }
    }

    // Наполнение миски едой, если корма не хватает покушать
    public void addFood(FoodBag foodBag) {
        Scanner scanner = new Scanner(System.in);
        String response;
        int addFood;
        System.out.print("Пополнить запас корма? Y / N: ");
        response = scanner.next();
        if (Objects.equals(response, "Y") || Objects.equals(response, "y")) {
            System.out.print("Введите объем добавки: ");
            addFood = scanner.nextInt();
            foodBag.setVolFoodBag(foodBag.getVolFoodBag() + addFood);
            if (foodBag.getVolFoodBag() >= volAnimalBowl) {
                foodBag.fillBowl(volAnimalBowl);
            } else {
                volAnimalBowl = 0;
            }
        } else {
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
