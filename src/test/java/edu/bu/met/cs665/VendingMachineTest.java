/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/22/2024
 * File Name: VendingMachineTest.java
 * Description: This class contains unit tests for the VendingMachine class.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.allmodels.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VendingMachineTest {
    private VendingMachine machine;

    @BeforeEach
    void setUp() {
        machine = new VendingMachine();
    }

    @Test
    void testPrepareEspressoWithCondiments() {
        Beverage espresso = new Espresso();
        machine.addCondiment(Condiment.MILK, 2);
        machine.addCondiment(Condiment.SUGAR, 1);

        String result = machine.prepareBeverage(espresso);
        assertEquals("Brewing coffee: Espresso with 2 units of milk and 1 units of sugar.", result);
        assertEquals(3.50, machine.calculatePrice(espresso), 0.01);
    }

    @Test
    void testAddTooMuchSugar() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> machine.addCondiment(Condiment.SUGAR, 4));
        assertEquals("Units must be between 0 and 3", exception.getMessage());
    }

    @Test
    void testResetCondiments() {
        machine.addCondiment(Condiment.MILK, 2);
        machine.addCondiment(Condiment.SUGAR, 1);
        machine.resetCondiments();

        Beverage espresso = new Espresso();
        String result = machine.prepareBeverage(espresso);
        assertEquals("Brewing coffee: Espresso with 0 units of milk and 0 units of sugar.", result);
        assertEquals(2.00, machine.calculatePrice(espresso), 0.01);
    }
}
