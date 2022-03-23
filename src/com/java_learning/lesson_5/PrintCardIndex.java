package com.java_learning.lesson_5;

public class PrintCardIndex {

    public static void main(String[] args) {
        Employee employee_1 = new Employee("Ivan", "Engineer", "ivan@mail.ru", 25, 200, "+79036001000");
        Employee employee_2 = new Employee("Petr", "Senior Engineer", "pert@mail.ru", 41, 300, "+79036001001");
        Employee employee_3 = new Employee("Sergey", "Junior Engineer", "sergey@mail.ru", 39, 100, "+79036001002");
        Employee employee_4 = new Employee("Vladimir", "Engineer", "vladimir@mail.ru", 27, 200, "+79036001003");
        Employee employee_5 = new Employee("Ilya", "Engineer", "ilya@mail.ru", 55, 200, "+79036001004");

        System.out.println(employee_1.printCardEmployee());
        System.out.println(employee_2.printCardEmployee());
        System.out.println(employee_3.printCardEmployee());
        System.out.println(employee_4.printCardEmployee());
        System.out.println(employee_5.printCardEmployee());

        System.out.println("Сотрудники старше 40 лет: ");

        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = employee_1;
        employeeArray[1] = employee_2;
        employeeArray[2] = employee_3;
        employeeArray[3] = employee_4;
        employeeArray[4] = employee_5;

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 40) {
                System.out.println(employeeArray[i].printCardEmployee());
            }
        }
    }
}
