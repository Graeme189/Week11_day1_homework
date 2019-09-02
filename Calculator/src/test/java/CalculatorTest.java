import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest  {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(10.0, 5.0);
    }

    @Test
    public void add() {
        assertEquals(15.0, calculator.add());
    }

    @Test
    public void subtract() {
        assertEquals(5.0, calculator.subtract());
    }

    @Test
    public void multiply() {
        assertEquals(50.0, calculator.multiply());
    }

    @Test
    public void divide() {
        assertEquals(2.0, calculator.divide());
    }

}
