import com.quiz2.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test; //used for annotation

public class CalculatorTest {

    //initating calculator to test it
    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        
        //if values passed in assertEquals match -> pass, if not -> fail
        int expected = -1;
        int actual = 2;
        assertEquals(expected, actual);
    }
}