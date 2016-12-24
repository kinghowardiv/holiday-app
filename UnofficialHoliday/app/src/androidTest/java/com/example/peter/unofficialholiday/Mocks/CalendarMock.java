package com.example.peter.unofficialholiday.Mocks;

import com.example.peter.unofficialholiday.Interfaces.ICalendar;

/**
 * Created by peter on 12/14/2016.
 */

public class CalendarMock implements ICalendar {
    public int Month;
    public int Day;

    public void SetMonth(int month){
        Month = month;
    }

    public void SetDay(int day){
        Day = day;
    }

    @Override
    public int GetDayOfTheMonth() {
        return Day;
    }

    @Override
    public int GetCurrentMonth() {
        return Month;
    }
}
