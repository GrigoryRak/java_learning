package com.java_learning.lesson_6;

public class Dog extends Animals {

    private int checkSkillRun;
    private int checkSkillSwim;

    public Dog(String animalName, int skillRun, int skillSwim) {
        super(animalName, skillRun, skillSwim);
    }

    public void setCheckSkillRun(int checkSkillRun) {
        if (checkSkillRun > getSkillRun()) {
            printDogRun();
        } else if (checkSkillRun < 0) {
            printDogRun();
        } else if (checkSkillRun == 0 && checkSkillRun == getSkillRun()) {
            printDogRun();
        } else {
            this.checkSkillRun = checkSkillRun;
        }
    }

    public void setCheckSkillSwim(int checkSkillSwim) {
        if (checkSkillSwim > getSkillSwim()) {
            printDogSwim();
        } else if (checkSkillSwim < 0) {
            printDogSwim();
        } else if (checkSkillSwim == 0 && checkSkillSwim == getSkillSwim()) {
            printDogSwim();
        } else {
            this.checkSkillSwim = checkSkillSwim;
        }
    }

    public String printDogRun() {
        if (checkSkillRun >= 0 && checkSkillRun <= getSkillRun()) {
            return getAnimalName() + " пробежал " + checkSkillRun + " метров.";
        } else if (checkSkillRun == 0 && checkSkillRun == getSkillRun()) {
            return getAnimalName() + " не умеет бегать.";
        } else return "Введите корректную дистанцию от 1 до " + getSkillRun();
    }

    public String printDogSwim() {
        if (checkSkillSwim >= 0 && checkSkillSwim <= getSkillSwim()) {
            return getAnimalName() + " проплыл " + checkSkillSwim + " метров.";
        } else if (checkSkillSwim == 0 && checkSkillSwim == getSkillSwim()) {
            return getAnimalName() + " не умеет плавать.";
        } else return "Введите корректную дистанцию от 1 до " + getSkillSwim();
    }

}
