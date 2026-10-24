import com.quiz2.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test; //used for annotation

public class CalculatorTest {

    //initating calculator to test it
    Calculator calculator = new Calculator();

            
    //if values passed in assertEquals match -> pass, if not -> fail
    @Test
    public void testSum() {
        int expected = 3;
        int actual = calculator.sum(1, 2);      //1+2 = 3
        assertEquals(expected, actual);
    }

     @Test
    public void testSubtract() {
        int expected = -1;
        int actual = calculator.sum(1, 2);      //1-2 = 3
        assertEquals(expected, actual);
    }
}