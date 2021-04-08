import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void oneAndTwoAdd(){

        assertEquals(3, Calculator.add(1,2));
    }
    @Test
    public void negativesAdd(){

        assertEquals(-2, Calculator.add(-1,-1));
    }
    @Test
    public void multipleNumbersAdd(){

        assertEquals(15, Calculator.add(1,2,3,4,5));
    }
    @Test
    public void oneAndThreeMultiply(){

        assertEquals(3, Calculator.multiply(1,3));
    }
    @Test
    public void multiplyNegative(){

        assertEquals(-3, Calculator.multiply(-1,3));
    }
    @Test
    public void multiplyFiveNumbers(){

        assertEquals(120, Calculator.multiply(1,2,3,4,5));
    }
}
