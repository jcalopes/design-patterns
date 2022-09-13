package org.canvas.expenses;

public class Manager implements Payee{
    String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void payExpenses(int amount) {
        System.out.println(name + " has been paid $ " + amount);
    }
}
