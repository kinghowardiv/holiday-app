package com.example.peter.unofficialholiday;

import com.example.peter.unofficialholiday.Interfaces.IMonthChecker;
import com.example.peter.unofficialholiday.Mocks.CalendarMock;
import com.example.peter.unofficialholiday.Months.April;
import com.example.peter.unofficialholiday.Months.August;
import com.example.peter.unofficialholiday.Months.December;
import com.example.peter.unofficialholiday.Months.February;
import com.example.peter.unofficialholiday.Months.January;
import com.example.peter.unofficialholiday.Months.July;
import com.example.peter.unofficialholiday.Months.June;
import com.example.peter.unofficialholiday.Months.March;
import com.example.peter.unofficialholiday.Months.May;
import com.example.peter.unofficialholiday.Months.Month;
import com.example.peter.unofficialholiday.Months.November;
import com.example.peter.unofficialholiday.Months.October;
import com.example.peter.unofficialholiday.Months.September;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by peter on 12/14/2016.
 */

public class MonthCheckerTests extends TestCase{

    private IMonthChecker MonthChecker;
    private CalendarMock CalendarMock;

    @Before
    public void Setup(){
        MonthChecker = new MonthChecker();
        CalendarMock = new CalendarMock();
    }

    @Test
    public void GetJanuaryInfoTest(){
        January expected = new January();
        CalendarMock.SetMonth(0);

        Month actual = MonthChecker.GetMonthInfo(CalendarMock);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void GetFebruaryInfoTest(){
        February expected = new February();
        CalendarMock.SetMonth(1);

        Month actual = MonthChecker.GetMonthInfo(CalendarMock);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void GetMarchInfoTest(){
        March expected = new March();
        CalendarMock.SetMonth(2);

        Month actual = MonthChecker.GetMonthInfo(CalendarMock);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void GetAprilInfoTest(){
        April expected = new April();
        CalendarMock.SetMonth(3);

        Month actual = MonthChecker.GetMonthInfo(CalendarMock);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void GetMayInfoTest(){
        May expected = new May();
        CalendarMock.SetMonth(4);

        Month actual = MonthChecker.GetMonthInfo(CalendarMock);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void GetJuneInfoTest(){
        June expected = new June();
        CalendarMock.SetMonth(5);

        Month actual = MonthChecker.GetMonthInfo(CalendarMock);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void GetJulyInfoTest(){
        July expected = new July();
        CalendarMock.SetMonth(6);

        Month actual = MonthChecker.GetMonthInfo(CalendarMock);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void GetAugustInfoTest(){
        August expected = new August();
        CalendarMock.SetMonth(7);

        Month actual = MonthChecker.GetMonthInfo(CalendarMock);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void GetSeptemberInfoTest(){
        September expected = new September();
        CalendarMock.SetMonth(8);

        Month actual = MonthChecker.GetMonthInfo(CalendarMock);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void GetOctoberInfoTest(){
        October expected = new October();
        CalendarMock.SetMonth(9);

        Month actual = MonthChecker.GetMonthInfo(CalendarMock);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void GetNovemberInfoTest(){
        November expected = new November();
        CalendarMock.SetMonth(10);

        Month actual = MonthChecker.GetMonthInfo(CalendarMock);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void GetDecemberInfoTest(){
        December expected = new December();
        CalendarMock.SetMonth(11);

        Month actual = MonthChecker.GetMonthInfo(CalendarMock);
        Assert.assertEquals(expected, actual);
    }
}
