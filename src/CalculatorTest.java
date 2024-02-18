import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void addition() {
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    public void subtraction() {
        assertEquals(5, calculator.sub(10,5));
    }
    @Test
    public void subtractionNegativResult(){
        assertEquals(-5, calculator.sub(5,10));
    }

    @Test(expected=ArithmeticException.class)
    public void divideByZero(){
        calculator.div(10,0);
    }   
    @Test
    public void divide(){
        assertEquals(10, calculator.div(100,10));
    }  

    @Test
    public void multiplication() {
        assertEquals(1, calculator.mult(1, 1));
    }

    @Test
    public void abselutNumber(){
        assertEquals(10, calculator.abs(-10));
    }

    @Test
    public void factorial(){
        assertEquals(120, calculator.fact(5));
    }
    

}