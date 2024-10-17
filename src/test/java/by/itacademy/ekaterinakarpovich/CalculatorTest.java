package by.itacademy.ekaterinakarpovich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testAdditionPositiveNumbers() {
        assertEquals(10, calculator.add(2, 8), "Сумма должна быть равна 10");
    }

    @Test
    void testAdditionPositiveAndZeroNumbers() {
        assertEquals(125, calculator.add(0, 125), "Сумма должна быть равна 125");
    }
}
