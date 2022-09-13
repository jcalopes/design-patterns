package org.proxy;

public class Main {

  public static void main(String[] args) {

    //Instead of instantiate SuperstoreInventory that add all the items in the moment of its creation, we create a SuperstoreInventoryProxy class.
    //This class only instantiate SuperstoreInventory when we call print inventory. This is also called as lazy loading. By doing this we are improving the
    //startup performance of our application. We are illustrating a simple use case but this could be a database rather than an arraylist.
    Inventory inventory = new SuperstoreInventoryProxy();
    Store store = new Store("Healthy Wholefoods", "Los Angeles", inventory);

    store.printName();
    store.printLocation();
    store.printInventory();
  }
}
