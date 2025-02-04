package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BMICalculatorTest {
    @Test
    public void testConstructor() {
        BMICalculator calculator = new BMICalculator("Max", "Mustermann", 170, 70, 'm');
        assertEquals("Max", calculator.getFirstname());
        assertEquals("Mustermann", calculator.getLastname());
        assertEquals(170, calculator.getBodyHeight());
        assertEquals(70, calculator.getBodyWeight(), 0.01);
        assertEquals('m', calculator.getGender());
    }

    @Test
    public void testCalculateBMI() {
        BMICalculator calculator = new BMICalculator("Max", "Mustermann", 170, 70, 'm');
        double bmi = calculator.calculateBMI();
        assertEquals(24.22, bmi, 0.01);
    }
    @Test
    public void testCalculateBMICategory() {
        BMICalculator calculator = new BMICalculator("Max", "Mustermann", 170, 70, 'm');
        int category = calculator.calculateBMICategory();
        assertEquals(1, category); // Normalgewicht
    }
    @Test
    public void testGetBMICategoryName() {
        BMICalculator calculator = new BMICalculator("Max", "Mustermann", 170, 70, 'm');
        String categoryName = calculator.getBMICategoryName();
        assertEquals("Normalgewicht", categoryName);
    }

}
