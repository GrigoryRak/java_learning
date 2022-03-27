package com.java_learning.lesson_6;

//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
// Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//4. * Добавить подсчет созданных котов, собак и животных.

public class Animals {
    protected String animalName;
    protected String skillName;
    protected String havingSkill;
    protected int pathLongMax;


    public Animals (String animalName, String skillName, String havingSkill){
        this.animalName = animalName;
        this.skillName = skillName;
        this.havingSkill = havingSkill;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getSkillName() {
        return skillName;
    }

    public String getHavingSkill() {
        return havingSkill;
    }

    public int getPathLongMax() {
        return pathLongMax;
    }

    public void setPathLongMax(int pathLongMax) {
        this.pathLongMax = pathLongMax;
    }

    public String printAnimalCard() {
        return "Animals{" +
                "animalName='" + animalName + '\'' +
                ", skillName='" + skillName + '\'' +
                ", havingSkill='" + havingSkill + '\'' +
                ", pathLengMax=" + pathLongMax +
                '}';
    }
}
