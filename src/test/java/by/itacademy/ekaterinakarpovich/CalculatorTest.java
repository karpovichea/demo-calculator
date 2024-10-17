package by.itacademy.ekaterinakarpovich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testAdditionPositiveNumbers() {
        assertEquals(10, calculator.add(2, 8), "Сумма должна быть равна 10");
    }
}
