package org.example;

import org.example.expenses.Manager;
import org.example.expenses.Payee;
import org.example.expenses.SalesPerson;
import org.example.expenses.SalesTeam;

/**
 * Hello world!
 *
 */
public class CompositeDemo
{
    public static void main( String[] args )
    {
        Manager jane = new Manager("Jane");
        SalesPerson bob = new SalesPerson("Bob");
        SalesPerson sue = new SalesPerson("Sue");

        SalesTeam team = new SalesTeam();
        team.addPayee(jane);
        team.addPayee(bob);
        team.addPayee(sue);

        payPayee(jane, 100);
        payPayee(bob, 100);
        payPayee(team, 100);
    }

    private static void payPayee(Payee payee,int amount){
        System.out.println("Expenses have been requested!");
        payee.payExpenses(amount);
        System.out.println("Expenses have been paid!");
    }
}
