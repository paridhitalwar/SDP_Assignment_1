/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/22/2024
 * File Name: Main.java
 * Description: This is the Main class to run the beverage vending machine.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.allmodels.*;

public class Main {

  public static void main(String[] args) {
    VendingMachine machine = new VendingMachine();

    // Brew an Americano
    Beverage americano = machine.brew("Americano");
    machine.addCondiment(Condiment.MILK, 2);
    machine.addCondiment(Condiment.SUGAR, 1);
    System.out.println(machine.prepareBeverage(americano));
    System.out.println("Total cost: $" + machine.calculatePrice(americano));

    // Brew a Black Tea
    machine.resetCondiments();
    Beverage blackTea = machine.brew("Black Tea");
    machine.addCondiment(Condiment.MILK, 1);
    machine.addCondiment(Condiment.SUGAR, 3);
    System.out.println(machine.prepareBeverage(blackTea));
    System.out.println("Total cost: $" + machine.calculatePrice(blackTea));
  }
}

