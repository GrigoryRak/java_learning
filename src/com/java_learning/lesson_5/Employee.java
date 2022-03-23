package com.java_learning.lesson_5;

public class Employee {
    private String fio;
    private String position;
    private String email;
    private int age;
    private int wages;
    private String phoneNumber;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPosition(){
        return position;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getWages(){
        return wages;
    }

    public void setWages(int wages){
        this.wages = wages;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public Employee(String fio, String position, String email, int age, int wages, String phoneNumber){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.age = age;
        this.wages = wages;
        this.phoneNumber = phoneNumber;
    }

    public String printCardEmployee() {
        return  "fio='" + fio + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", wages=" + wages +
                ", phoneNumber='" + phoneNumber + '\'';
    }
}
