package org.example;

import java.util.Iterator;

public class StaffListIterator implements Iterator<Employee> {
    Employee[] employees;
    int index;

    public StaffListIterator(Employee... listEmployees) {
        this.employees = listEmployees;
    }

    @Override
    public boolean hasNext() {
        return (index < employees.length);
    }

    @Override
    public Employee next() {
        if (hasNext()) {
            return employees[index++];
        }
        return null;
    }
}
