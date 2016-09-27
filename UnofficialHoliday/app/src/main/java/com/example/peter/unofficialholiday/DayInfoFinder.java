package com.example.peter.unofficialholiday;

import com.example.peter.unofficialholiday.Months.Month;

import java.util.Calendar;
import java.util.HashMap;

/**
 * Created by peter on 2/14/2016.
 */
public class DayInfoFinder {

    private final Calendar cal = Calendar.getInstance();
    private MonthChecker monthChecker = new MonthChecker();

    //Finds the day
    public String FindDay(){
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        Month currentMonth = monthChecker.checkMonth(cal);
        HashMap<Integer, String> monthMap = currentMonth.getDayNumberAndPhraseMap();

        return monthMap.get(dayOfMonth);
    }
}
