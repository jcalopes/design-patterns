package org.sales;

import org.sales.command.Command;

public class OrderHandler {

  public void invoke(Command command) {
    command.execute();
  }

}
