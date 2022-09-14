package org.example;

import java.util.Iterator;

public class StaffList implements Iterable<Employee> {
    Employee[] employees;

    public StaffList(Employee... employees){
        this.employees = employees;
    }

    @Override
    public Iterator<Employee> iterator() {
        return new StaffListIterator(employees);
    }
}
