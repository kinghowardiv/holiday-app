package com.example.peter.unofficialholiday.Mocks;

import com.example.peter.unofficialholiday.Interfaces.ICalendar;
import com.example.peter.unofficialholiday.Interfaces.IMonthChecker;
import com.example.peter.unofficialholiday.Months.Month;

/**
 * Created by peter on 12/14/2016.
 */

public class MonthCheckerMock implements IMonthChecker {
    public Month Month;

    public void SetMonth(Month month){
        Month = month;
    }

    @Override
    public Month GetMonthInfo(ICalendar cal) {
        return Month;
    }
}
