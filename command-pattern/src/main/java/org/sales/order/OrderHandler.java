package org.sales.order;

import org.sales.commands.Command;

public class OrderHandler {

  public void invoke(Command command) {
    command.execute();
  }

}
