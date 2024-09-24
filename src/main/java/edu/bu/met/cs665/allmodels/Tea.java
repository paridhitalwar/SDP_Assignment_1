/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/22/2024
 * File Name: Tea.java
 * Description: This class represents a generic tea beverage.
 */

package edu.bu.met.cs665.allmodels;

public abstract class Tea extends Beverage {
    public Tea(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public String brew() {
        return "Brewing tea: " + getName();
    }
}
