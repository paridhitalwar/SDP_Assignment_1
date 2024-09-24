/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/22/2024
 * File Name: Coffee.java
 * Description: This class represents a generic coffee beverage.
 */

package edu.bu.met.cs665.allmodels;

public abstract class Coffee extends Beverage {
    public Coffee(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public String brew() {
        return "Brewing coffee: " + getName();
    }
}
