package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.add(1, 2), 3);
        assertThrows(IllegalArgumentException.class, () -> calculator.add(1, 0));
    }

    @org.junit.jupiter.api.Test
    void sub() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.sub(1, 2), -1);
        assertThrows(IllegalArgumentException.class, () -> calculator.sub(1, 0));
    }

    @org.junit.jupiter.api.Test
    void mul() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.mul(1, 2), 2);
        assertThrows(IllegalArgumentException.class, () -> calculator.mul(1, 0));
    }

    @org.junit.jupiter.api.Test
    void div() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.div(1, 2), 0.5);
        assertThrows(IllegalArgumentException.class, () -> calculator.div(0, 1));
    }
}