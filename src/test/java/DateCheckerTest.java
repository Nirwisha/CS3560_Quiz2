import com.quiz2.DateChecker;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DateCheckerTest {

    //initating datechecker to test
    DateChecker dateChecker = new DateChecker();

    @Test
    public void testJanuary() {
        boolean expected = true;
        boolean actual = dateChecker.has31Days(DateChecker.Month.JANUARY);        //should be true
        assertEquals(expected, actual);
    }

    @Test
    public void testNovember() {
        boolean expected = false;
        boolean actual = dateChecker.has31Days(DateChecker.Month.NOVEMBER);        //should be false
        assertEquals(expected, actual);
    }
    
}
