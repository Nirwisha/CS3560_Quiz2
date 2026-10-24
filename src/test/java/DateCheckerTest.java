import com.quiz2.DateChecker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

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

    //ParameterizedTest - allows us to pass in multiple values into one unittest instead of one by one (12)
    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"JANUARY", "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER"})

    public void testHas31Days(DateChecker.Month month){
        assertTrue(dateChecker.has31Days(month));
    }

}
