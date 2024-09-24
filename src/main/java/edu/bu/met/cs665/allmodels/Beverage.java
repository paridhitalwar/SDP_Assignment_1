/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/22/2024
 * File Name: Beverage.java
 * Description: This class represents a generic beverage.
 */

package edu.bu.met.cs665.allmodels;

public abstract class Beverage {
    private String name;
    private double basePrice;

    public Beverage(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public abstract String brew();
}
