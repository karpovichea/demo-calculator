package by.itacademy.ekaterinakarpovich;

public class Calculator {
    public int add(int a, int b) {
        if ((long) a + b > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if ((long) a + b < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return a + b;
        }
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на 0 запрещено!");
        }
        return a / b;
    }
}

