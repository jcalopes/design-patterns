package org.example;

public class Main {

    public static void main(String[] args) {

        Employee zak = new Employee("Zak");
        Employee sarah = new Employee("Sarah");
        Employee anna = new Employee("Anna");

        StaffList staffList = new StaffList(zak, sarah, anna);
        for (Employee emp : staffList) {
            System.out.println(emp);
        }
    }

}
