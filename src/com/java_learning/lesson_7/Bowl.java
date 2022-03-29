package com.java_learning.lesson_7;

public class Bowl {
    private int volAnimalBowl;

    public Bowl(int volAnimalBowl){
        this.volAnimalBowl = volAnimalBowl;
    }

    public int getVolAnimalBowl(){
        return volAnimalBowl;
    }

    public void setVolAnimalBowl(int volAnimalBowl) {
        this.volAnimalBowl = volAnimalBowl;
    }

    public String printVolAnimalBowl(){
        return "Миска вмещает " + volAnimalBowl + " грамм корма";
    }
}
