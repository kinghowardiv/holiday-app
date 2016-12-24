package com.example.peter.unofficialholiday;

import com.example.peter.unofficialholiday.Interfaces.IDayInfoFinder;
import com.example.peter.unofficialholiday.Mocks.CalendarMock;
import com.example.peter.unofficialholiday.Mocks.MonthCheckerMock;
import com.example.peter.unofficialholiday.Months.January;
import com.example.peter.unofficialholiday.Months.Month;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by peter on 11/24/2016.
 */
public class DayInfoFinderTests extends TestCase {

    private IDayInfoFinder DayInfoFinder;
    private CalendarMock CalendarMock;
    private MonthCheckerMock MonthCheckerMock;

    @Before
    public void Setup(){
        CalendarMock = new CalendarMock();
        MonthCheckerMock = new MonthCheckerMock();

        DayInfoFinder = new DayInfoFinder(CalendarMock, MonthCheckerMock);
    }

    @Test
    public void FindDayTest(){
        Month testMonth = new January();
        int dayOfMonth = 5;
        CalendarMock.SetDay(dayOfMonth);
        MonthCheckerMock.SetMonth(testMonth);

        String expectedMonthInfo = DayInfoFinder.FindDay();
        String actualMonthInfo = testMonth.getDayNumberAndPhraseMap().get(dayOfMonth);

        Assert.assertEquals(expectedMonthInfo, actualMonthInfo);
    }
}