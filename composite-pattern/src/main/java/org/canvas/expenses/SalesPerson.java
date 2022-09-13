package org.canvas.expenses;

public class SalesPerson implements Payee{
    String name;

    public SalesPerson(String name) {
        this.name = name;
    }

    @Override
    public void payExpenses(int amount) {
        System.out.println(name + " has been paid $ " + amount);
    }
}
