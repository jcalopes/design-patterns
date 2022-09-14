package org.sales;

import org.sales.command.PlaceOrderCommand;
import org.sales.command.ReturnOrderCommand;

public class SalesOrderClient {

  private static Jacket jacket = new Jacket();

  public static void main(String[] args) {

    OrderHandler placeOrderHandler = new OrderHandler();
    OrderHandler returnOrderHandler = new OrderHandler();

    //You pass the request as a stand-alone object.
    placeOrderHandler.invoke(new PlaceOrderCommand(jacket));
    returnOrderHandler.invoke(new ReturnOrderCommand(jacket));
  }

}
