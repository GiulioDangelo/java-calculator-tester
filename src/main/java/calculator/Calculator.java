package calculator;

public class Calculator {
    public float add(float a, float b) throws IllegalArgumentException {
        checkValue(a, b);
        return a + b;
    }

    public float sub(float a, float b) throws IllegalArgumentException {
        checkValue(a, b);
        return a - b;
    }

    public float mul(float a, float b) throws IllegalArgumentException {
        checkValue(a, b);
        return a * b;
    }

    public float div(float a, float b) throws IllegalArgumentException {
        checkValue(a, b);
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("Error: Division by zero is not allowed.");
        }
    }

    private void checkValue(float a, float b) throws IllegalArgumentException {
        if (Float.isNaN(a) || Float.isNaN(b)) {
            throw new IllegalArgumentException("Error: Invalid input. Please enter valid numbers.");
        }
    }
}
