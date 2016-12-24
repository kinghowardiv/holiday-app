package com.example.peter.unofficialholiday;

import android.app.Activity;
import android.widget.RelativeLayout;

import com.example.peter.unofficialholiday.Interfaces.IBackgroundSetter;
import com.example.peter.unofficialholiday.Interfaces.IEffectsFactory;
import com.example.peter.unofficialholiday.Months.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by peter on 12/19/2015.
 */
public class BackgroundSetter implements IBackgroundSetter{

    private IEffectsFactory EffectsFactory;
    private Constants Constants;

    public BackgroundSetter(IEffectsFactory effectsFactory, Constants constants){
        EffectsFactory = effectsFactory;
        Constants = constants;
    }

    public void SetBackground(Month currentMonth, Activity currentActivity, RelativeLayout linearLayout){
        String month = currentMonth.getMonthName();
        Season currentSeason = FindSeason(month);

        switch (currentSeason) {
            case SPRING:
                SetSeasonWithTopDownEffects(currentActivity, R.drawable.winter, R.drawable.snowflake2, linearLayout);
                break;
            case SUMMER:
                SetSeasonWithTopDownEffects(currentActivity, R.drawable.summer, R.drawable.ball, linearLayout);
                break;
            case WINTER:
                SetSeasonWithTopDownEffects(currentActivity, R.drawable.spring, R.drawable.bee, linearLayout);
                break;
            default:
                SetSeasonWithSideEffects(currentActivity, R.drawable.fall, R.drawable.leaf, linearLayout);
                break;
        }
    }

    private void SetSeasonWithTopDownEffects(Activity currentActivity, int backgroundImage, int effectImage, RelativeLayout linearLayout){
        linearLayout.setBackgroundResource(backgroundImage);
        EffectsFactory.AddTopDownEffects(currentActivity, effectImage);
    }

    private void SetSeasonWithSideEffects(Activity currentActivity, int backgroundImage, int effectImage, RelativeLayout linearLayout){
        linearLayout.setBackgroundResource(backgroundImage);
        EffectsFactory.AddSlideEffects(currentActivity, effectImage);
    }

    private Season FindSeason(String month) {
        if (WinterMonths().contains(month))
            return Season.WINTER;
        if (SpringMonths().contains(month))
            return Season.SPRING;
        if (SummerMonths().contains(month))
            return Season.SUMMER;
        return Season.FALL;
    }

    private List<String> WinterMonths() {
        List<String> winterMonths = new ArrayList<>();
        winterMonths.add(Constants.January);
        winterMonths.add(Constants.February);
        winterMonths.add(Constants.December);
        return winterMonths;
    }

    private List<String> SpringMonths(){
        List<String> springMonths = new ArrayList<>();
        springMonths.add(Constants.March);
        springMonths.add(Constants.April);
        springMonths.add(Constants.May);
        return springMonths;
    }

    private List<String> SummerMonths(){
        List<String> summerMonths = new ArrayList<>();
        summerMonths.add(Constants.June);
        summerMonths.add(Constants.July);
        summerMonths.add(Constants.August);
        return summerMonths;
    }
}
