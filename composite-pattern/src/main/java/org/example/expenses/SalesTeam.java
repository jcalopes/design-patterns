package org.example.expenses;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Payee{
    private List<Payee> payees = new ArrayList<>();

    public void addPayee(Payee payee){
        payees.add(payee);
    }

    @Override
    public void payExpenses(int amount) {
        payees.forEach(payee -> {payee.payExpenses(amount);});
    }
}
