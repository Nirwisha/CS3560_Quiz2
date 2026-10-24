package com.quiz2;

import java.util.Arrays;

public class DateChecker {
    
    public enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    private DateChecker.Month[] monthThirtyOneDays = {Month.JANUARY, Month.MARCH, Month.MAY, Month.JULY, Month.AUGUST, Month.OCTOBER, Month.DECEMBER};

    public boolean has31Days(Month month) {
       if (month == null) {
        throw new IllegalArgumentException("Month input cannot be null");
       }
       else if (Arrays.asList(monthThirtyOneDays).contains(month)) {
        return true;
       }
       else {
        return false;
       }
    
    }
}
