package com.example.peter.unofficialholiday;

import com.example.peter.unofficialholiday.Interfaces.ICalendar;
import com.example.peter.unofficialholiday.Interfaces.IDayInfoFinder;
import com.example.peter.unofficialholiday.Interfaces.IMonthChecker;
import com.example.peter.unofficialholiday.Months.Month;

import java.util.Calendar;
import java.util.HashMap;

/**
 * Created by peter on 2/14/2016.
 */
public class DayInfoFinder implements IDayInfoFinder{

    private ICalendar Cal;
    private IMonthChecker MonthChecker;

    public DayInfoFinder(ICalendar cal, IMonthChecker monthChecker){
        Cal = cal;
        MonthChecker = monthChecker;
    }

    public String FindDay(){
        int dayOfMonth = Cal.GetDayOfTheMonth();
        Month currentMonth = MonthChecker.GetMonthInfo(Cal);
        HashMap<Integer, String> monthMap = currentMonth.getDayNumberAndPhraseMap();

        return monthMap.get(dayOfMonth);
    }
}
