package com.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class BMICalculatorTest {
    @Test
    public void testConstructor() {
        BMICalculator calculator = new BMICalculator("Max", "Mustermann", 170, 70, 'm');
        Assertions.assertEquals("Max", calculator.getFirstname());
        Assertions.assertEquals("Mustermann", calculator.getLastname());
        Assertions.assertEquals(170, calculator.getBodyHeight());
        Assertions.assertEquals(70, calculator.getBodyWeight(), 0.01);
        Assertions.assertEquals('m', calculator.getGender());
    }

    @Test
    public void testCalculateBMI() {
        BMICalculator calculator = new BMICalculator("Max", "Mustermann", 170, 70, 'm');
        double bmi = calculator.calculateBMI();
        Assertions.assertEquals(24.22, bmi, 0.01);
    }
    @Test
    public void testCalculateBMICategory() {
        BMICalculator calculator = new BMICalculator("Max", "Mustermann", 170, 70, 'm');
        int category = calculator.calculateBMICategory();
        Assertions.assertEquals(0, category); // Normalgewicht
    }
    @Test
    public void testGetBMICategoryName() {
        BMICalculator calculator = new BMICalculator("Max", "Mustermann", 170, 70, 'm');
        String categoryName = calculator.getBMICategoryName();
        Assertions.assertEquals("Normalgewicht", categoryName);
    }

}
