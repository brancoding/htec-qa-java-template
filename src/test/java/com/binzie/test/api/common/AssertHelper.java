package com.binzie.test.api.common;

public class AssertHelper {
    public static boolean verifyWithTolerance(long tolerance, String actualDate, String expectedDate)
    {
        long timeDiff = 0;
        timeDiff = Dates.parseToClientFormatDateTime(actualDate).toLocalTime().toSecondOfDay() -
                Dates.parseToClientFormatDateTime(expectedDate).toLocalTime().toSecondOfDay();
        if (timeDiff > tolerance) {
            return false;
        } else {
            return true;
        }
    }
}

