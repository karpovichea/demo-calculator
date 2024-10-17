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
        assertEquals(125, calculator.add(125, 0), "Сумма должна быть равна 125");
    }

    @Test
    void testAdditionPositiveAndNegativeNumbers() {
        assertEquals(1000, calculator.add(2000, -1000), "Сумма должна быть равна 1000");
    }

    @Test
    void testAdditionNegativeNumbers() {
        assertEquals(-555, calculator.add(-550, -5), "Сумма должна быть равна -555");
    }

    @Test
    void testAdditionNegativeAndZeroNumbers() {
        assertEquals(-189, calculator.add(-189, 0), "Сумма должна быть равна -189");
    }

    @Test
    void testAdditionZeroNumbers() {
        assertEquals(0, calculator.add(0, 0), "Сумма должна быть равна 0");
    }

    @Test
    void testAdditionMaxAndMinIntegerValues() {
        assertEquals(-1, calculator.add(Integer.MAX_VALUE, Integer.MIN_VALUE ), "Сумма должна быть равна -1");
    }
}
