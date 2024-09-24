/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/22/2024
 * File Name: VendingMachine.java
 * Description: This class represents a vending machine for brewing beverages.
 */

//package edu.bu.met.cs665;
package edu.bu.met.cs665.allmodels;

import java.util.EnumMap;
import java.util.Map;

public class VendingMachine {
    private Map<Condiment, Integer> condiments = new EnumMap<>(Condiment.class);

    public VendingMachine() {
        resetCondiments();
    }

    public void resetCondiments() {
        for (Condiment condiment : Condiment.values()) {
            condiments.put(condiment, 0);
        }
    }

    public void addCondiment(Condiment condiment, int units) {
        if (units < 0 || units > 3) {
            throw new IllegalArgumentException("Units must be between 0 and 3");
        }
        condiments.put(condiment, units);
    }

    public double calculatePrice(Beverage beverage) {
        double total = beverage.getBasePrice();
        for (Map.Entry<Condiment, Integer> entry : condiments.entrySet()) {
            total += entry.getValue() * entry.getKey().getPrice();
        }
        return total;
    }

    public String prepareBeverage(Beverage beverage) {
        return beverage.brew() + " with " +
                condiments.get(Condiment.MILK) + " units of milk and " +
                condiments.get(Condiment.SUGAR) + " units of sugar.";
    }

    /**
     * Method for creating new beverage objects.
     * @param beverageName - user input beverage name
     * @return beverage object matching user input.
     */
    public Beverage brew(String beverageName) {
        Beverage drink = null;
        switch (beverageName) {
            case "Americano":
                drink = new Americano();
                break;
            case "Black Tea":
                drink = new BlackTea();
                break;
            case "Yellow Tea":
                drink = new YellowTea();
                break;
            case "Green Tea":
                drink = new GreenTea();
                break;
            case "Espresso":
                drink = new Espresso();
                break;
            case "Latte Macchiato":
                drink = new LatteMacchiato();
                break;
            default:
                throw new IllegalArgumentException("Unknown beverage: " + beverageName);
        }
        return drink;
    }
}
