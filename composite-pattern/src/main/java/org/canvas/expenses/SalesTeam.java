package org.canvas.expenses;

import java.util.ArrayList;
import java.util.List;

/**
 * In composite pattern we want to treat the single and multiple object in the same way. So you will end up with a tree
 * structure.
 */
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
