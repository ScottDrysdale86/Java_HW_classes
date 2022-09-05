import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculatorTest {
    Calculator calc;

    @Before
    public void before(){
        calc = new Calculator();
    }

    @Test
    public void add() {
        assertEquals(5, calc.add(2,3));
    }

    @Test
    public void subtract() {
        assertEquals(2, calc.subtract(3,1));
    }

    @Test
    public void multiply() {
        assertEquals(6, calc.multiply(3,2));
    }
    @Test
    public void divide() {
        assertEquals(3, calc.divide(6,2),0.0);
    }
}
