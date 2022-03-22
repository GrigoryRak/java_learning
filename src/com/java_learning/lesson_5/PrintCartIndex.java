package com.java_learning.lesson_5;

public class PrintCartIndex {

    public static void main(String[] args){
        Employee employee_1 = new Employee("Ivan", "Engineer", "ivan@mail.ru", 25, 200, "+79036001000");
        Employee employee_2 = new Employee("Petr", "Senior Engineer", "pert@mail.ru", 41, 300, "+79036001001");
        Employee employee_3 = new Employee("Sergey", "Junior Engineer", "sergey@mail.ru", 39, 100, "+79036001002");
        Employee employee_4 = new Employee("Vladimir", "Engineer", "vladimir@mail.ru", 27, 200, "+79036001003");
        Employee employee_5 = new Employee("Ilya", "Engineer", "ilya@mail.ru", 55, 200, "+79036001004");
//        System.out.println(employee_1);
//        System.out.println(employee_2);
//        System.out.println(employee_3);
//        System.out.println(employee_4);
//        System.out.println(employee_5);

        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivan", "Engineer", "ivan@mail.ru", 25, 200, "+79036001000");
        employeeArray[1] = new Employee("Petr", "Senior Engineer", "pert@mail.ru", 41, 300, "+79036001001");
        employeeArray[2] = new Employee("Sergey", "Junior Engineer", "sergey@mail.ru", 39, 100, "+79036001002");
        employeeArray[3] = new Employee("Vladimir", "Engineer", "vladimir@mail.ru", 27, 200, "+79036001003");
        employeeArray[4] = new Employee("Ilya", "Engineer", "ilya@mail.ru", 55, 200, "+79036001004");

        for (int i = 0; i < employeeArray.length; i++){
            if (employeeArray[i].getAge()>40) {
                System.out.println(employeeArray[i]);
            }
        }


    }

//    public static void insertArray(){
//        String[][] arrayEmployee = new String[5][6];
//        int line = 0;
//        int col = 0;
//        for (int i = 0; i <arrayEmployee.length; i++){
//            for (int j = 0; j < arrayEmployee.length; j++){
//
//            }
//        }
//    }

}
