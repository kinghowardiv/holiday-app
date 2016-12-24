package com.example.peter.unofficialholiday.Interfaces;

import android.app.Activity;
import android.widget.RelativeLayout;

import com.example.peter.unofficialholiday.Months.Month;

/**
 * Created by peter on 12/14/2016.
 */

public interface IBackgroundSetter {
    void SetBackground(Month currentMonth, Activity currentActivity, RelativeLayout linearLayout);
}
