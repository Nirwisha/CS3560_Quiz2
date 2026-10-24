import com.quiz2.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        int actual = calculator.subtract(1, 2);      //1-2 = -1
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        int expected = 2;
        int actual = calculator.multiply(1, 2);      //1*2 = 2
        assertEquals(expected, actual);
    }

    @Test
    public void testDivide() {
        int expected = 2;
        int actual = calculator.divide(2, 1);      //2/1 = 2
        assertEquals(expected, actual);
    }

    @Test 
    public void testIsEven() {
        boolean expected = true;
        boolean actual = calculator.isEven(2);    //expecting true
        assertEquals(expected, actual);
    }

    //trying to divide by 0 -> throws IllegalArgumentException
    @Test 
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
        String expectedMessage = "Ints can NOT be divided by zero";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }

    //more cases/tests
    @Test
    public void testSum2() {
        int expected = -19;
        int actual = calculator.sum(-11, -8);      //-11+(-8) = -19
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract2() {
        int expected = 7;
        int actual = calculator.subtract(7,0);      //7-0 = 7
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply2() {
        int expected = 15;
        int actual = calculator.multiply(-5, -3);      //-5*-3 = 15
        assertEquals(expected, actual);
    }

    @Test 
    public void testIsOdd() {
        boolean expected = false;
        boolean actual = calculator.isEven(3);    //expecting false
        assertEquals(expected, actual);
    }

}