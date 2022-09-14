package org.sales.command;

import org.sales.Jacket;

public class PlaceOrderCommand implements Command {

  private Jacket jacket;

  public PlaceOrderCommand(Jacket jacket) {
    this.jacket = jacket;
  }

  @Override
  public void execute() {
    jacket.placeOrder();
  }
}
