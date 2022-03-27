package com.java_learning.lesson_6;

public class Cat extends Animals {

    private int checkSkillRun;
    private int checkSkillSwim;

    public Cat(String animalName, int skillRun, int skillSwim) {
        super(animalName, skillRun, skillSwim);
    }

    public void setCheckSkillRun(int checkSkillRun) {
        if (checkSkillRun > getSkillRun()) {
            printCatRun();
        } else if (checkSkillRun < 0) {
            printCatRun();
        } else if (checkSkillRun == 0 && checkSkillRun == getSkillRun()) {
            printCatRun();
        } else this.checkSkillRun = checkSkillRun;
    }

    public void setCheckSkillSwim(int checkSkillSwim) {
        if (checkSkillSwim > getSkillSwim()) {
            printCatSwim();
        } else if (checkSkillSwim < 0) {
            printCatSwim();
        } else if (checkSkillSwim == 0 && checkSkillSwim == getSkillSwim()) {
            printCatSwim();
        } else this.checkSkillSwim = checkSkillSwim;
    }

    public String printCatRun() {
        if (checkSkillRun > 0 && checkSkillRun <= getSkillRun()) {
            return getAnimalName() + " пробежал " + checkSkillRun + " метров.";
        } else if (checkSkillRun == 0 && checkSkillRun == getSkillRun()) {
            return getAnimalName() + " не умеет бегать.";
        } else return "Введите корректную дистанцию от 1 до " + getSkillRun();
    }


    public String printCatSwim() {
        if (checkSkillSwim > 0 && checkSkillSwim <= getSkillSwim()) {
            return getAnimalName() + " проплыл " + checkSkillSwim + " метров.";
        } else if (checkSkillSwim == 0 && checkSkillSwim == getSkillSwim()) {
            return getAnimalName() + " не умеет плавать.";
        } else return "Введите корректную дистанцию от 1 до " + getSkillSwim();
    }

}
