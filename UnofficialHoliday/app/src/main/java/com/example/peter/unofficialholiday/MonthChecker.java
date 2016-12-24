package com.example.peter.unofficialholiday;

import com.example.peter.unofficialholiday.Interfaces.ICalendar;
import com.example.peter.unofficialholiday.Interfaces.IMonthChecker;
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

/**
 * Created by peter on 12/17/2015.
 */
public class MonthChecker implements IMonthChecker{


    public Month GetMonthInfo(ICalendar cal) {
        int currentDate = cal.GetCurrentMonth()+ 1;
        Month currentMonth = FindCurrentMonthInfoContainer(currentDate);
        currentMonth.SetMonthInfo();
        return  currentMonth.GetMonthInfo();
    }

        private Month FindCurrentMonthInfoContainer(int currentDate){
            switch (currentDate){
                case (1):
                    return new January();
                case (2):
                    return new February();
                case (3):
                    return new March();
                case (4):
                    return new April();
                case (5):
                    return new May();
                case (6):
                    return new June();
                case (7):
                    return new July();
                case (8):
                    return new August();
                case (9):
                    return new September();
                case(10):
                    return new October();
                case (11):
                    return new November();
                case (12):
                    return new December();
            }
        return null;
    }
}
