package com.example.peter.unofficialholiday;

import java.util.HashMap;

/**
 * Created by peter on 12/17/2015.
 */
public class Month {
    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public String monthName;

    public HashMap<Integer, String> getDayNumberAndPhraseMap() {
        return dayNumberAndPhraseMap;
    }

    public void setDayNumberAndPhraseMap(HashMap<Integer, String> dayNumberAndPhraseMap) {
        this.dayNumberAndPhraseMap = dayNumberAndPhraseMap;
    }

    public HashMap<Integer, String> dayNumberAndPhraseMap;

}
