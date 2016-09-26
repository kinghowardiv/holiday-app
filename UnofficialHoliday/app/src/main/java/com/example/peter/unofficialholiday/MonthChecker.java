package com.example.peter.unofficialholiday;

import java.util.Calendar;

import POJO.April;
import POJO.August;
import POJO.December;
import POJO.February;
import POJO.January;
import POJO.July;
import POJO.June;
import POJO.March;
import POJO.May;
import POJO.November;
import POJO.October;
import POJO.September;

/**
 * Created by peter on 12/17/2015.
 */
public class MonthChecker {

    //Checks what month it is based on the get month function
    public Month checkMonth(Calendar cal){
        int currentDate = cal.get(Calendar.MONTH)+1;
        if (currentDate == 1){

            January januaryMonth = new January();
            januaryMonth.SetJanuaryInfo();
            return januaryMonth.GetJanuaryInfo();

        }else if (currentDate == 2){

            February februaryMonth = new February();
            februaryMonth.SetFebruaryInfo();
             return februaryMonth.GetFebruaryInfo();

        }else if (currentDate == 3){

            March marchMonth = new March();
            marchMonth.SetMarchInfo();
            return marchMonth.GetMarchInfo();

        }else if (currentDate == 4){

            April aprilMonth = new April();
            aprilMonth.SetAprilInfo();
            return aprilMonth.GetAprilInfo();

        }else if (currentDate == 5){

            May mayMonth = new May();
            mayMonth.SetMayInfo();
            return mayMonth.GetMayInfo();

        }else if (currentDate == 6){

            June juneMonth = new June();
            juneMonth.SetJanuaryInfo();
            return juneMonth.GetJuneMonth();

        }else if (currentDate == 7){

             July julyMonth = new July();
            julyMonth.SetJulyInfo();
            return julyMonth.GetJulyInfo();

        }else if (currentDate == 8){

            August augustMonth = new August();
            augustMonth.SetAugustInfo();
            return augustMonth.GetAugustInfo();

        }else if (currentDate == 9){

            September septemberMonth = new September();
            septemberMonth.SetSeptemberInfo();
            return septemberMonth.GetSeptemberInfo();

        }else if (currentDate == 10){

            October octoberMonth = new October();
            octoberMonth.SetOctoberInfo();
            return octoberMonth.GetOctoberInfo();

        }else if (currentDate == 11){

            November novemberMonth = new November();
            novemberMonth.SetNovemberInfo();
            return novemberMonth.GetNovemberMonth();

        }else if (currentDate == 12) {

            December decemberMonth = new December();
            decemberMonth.SetDecemberInfo();
            return decemberMonth.GetDecemberInfo();

        }
        return null;
    }
}
