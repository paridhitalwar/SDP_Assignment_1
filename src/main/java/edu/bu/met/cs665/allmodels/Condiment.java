/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/22/2024
 * File Name: Condiment.java
 * Description: This enum represents condiments that can be added to beverages.
 */

package edu.bu.met.cs665.allmodels;

public enum Condiment {
    MILK(0.50),
    SUGAR(0.50);

    private final double price;

    Condiment(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
