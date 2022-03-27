package com.java_learning.lesson_6;

public class Animals {
    protected String animalName;
    protected int skillRun;
    protected int skillSwim;

    public Animals (String animalName, int skillRun, int skillSwim){
        this.animalName = animalName;
        this.skillRun = skillRun;
        this.skillSwim = skillSwim;
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getSkillRun() {
        return skillRun;
    }

    public int getSkillSwim() {
        return skillSwim;
    }

    public String printAnimalCard() {
        return "Карта навыков животного: Кличка: " + animalName + ", навык бега: " + skillRun + " м.," + " навык плавания: " + skillSwim + " м.";
    }

}
