package com.java_learning.lesson_6;

public class Cat extends Animals{

    private int maxSkillRun;
    private int maxSkillSwim;

    public Cat(String animalName, int skillRun, int skillSwim) {
        super(animalName, skillRun, skillSwim);
    }

    public void setMaxSkillRun(int maxSkillRun) {
        if (maxSkillRun > getSkillRun()) {
            printCatRun();
        } else if (maxSkillRun < 0) {
            printCatRun();
        } else if (maxSkillRun == 0 && maxSkillRun == getSkillRun()) {
            printCatRun();
        } else this.maxSkillRun = maxSkillRun;
    }

    public void setMaxSkillSwim(int maxSkillSwim) {
        if (maxSkillSwim > getSkillSwim()) {
            printCatSwim();
        } else if (maxSkillSwim < 0) {
            printCatSwim();
        } else if (maxSkillSwim == 0 && maxSkillSwim == getSkillSwim()) {
            printCatSwim();
        } else this.maxSkillSwim = maxSkillSwim;
    }

    public String printCatRun() {
        if (maxSkillRun > 0 && maxSkillRun <= getSkillRun()) {
            return getAnimalName() + " пробежал " + maxSkillRun + " метров.";
        } else if (maxSkillRun == 0 && maxSkillRun == getSkillRun()) {
            return getAnimalName() + " не умеет бегать.";
        } else return "Введите корректную дистанцию от 1 до " + getSkillRun();
    }

    public String printCatSwim() {
        if (maxSkillSwim > 0 && maxSkillSwim <= getSkillSwim()) {
            return getAnimalName() + " проплыл " + maxSkillSwim + " метров.";
        } else if (maxSkillSwim == 0 && maxSkillSwim == getSkillSwim()) {
            return getAnimalName() + " не умеет плавать.";
        } else return "Введите корректную дистанцию от 1 до " + getSkillSwim();
    }

}
