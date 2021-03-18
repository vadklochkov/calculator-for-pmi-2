package lecture1.model;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void plus() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.plus(2));
    }
}