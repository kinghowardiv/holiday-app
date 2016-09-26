package com.example.peter.unofficialholiday;

import android.app.Activity;
import android.widget.RelativeLayout;

import com.plattysoft.leonids.ParticleSystem;

/**
 * Created by peter on 12/19/2015.
 */
public class BackgroundSetter {

    //Sets the background and creates particle effects
    public void setBackground(Month currentMonth, Activity currentActivity, RelativeLayout linearLayout){
        String month = currentMonth.getMonthName();

        if (month.equals("January") || month.equals("February") || month.equals("December")){
            linearLayout.setBackgroundResource(R.drawable.winter);
            new ParticleSystem(currentActivity, 80, R.drawable.snowflake2, 10000)
                    .setSpeedModuleAndAngleRange(0f, 0.1f, 50, 130)
                    .setRotationSpeed(144)
                    .setAcceleration(0.000017f, 90)
                    .emit(400, 10, 1);

            new ParticleSystem(currentActivity, 80, R.drawable.snowflake2, 10000)
                    .setSpeedModuleAndAngleRange(0f, 0.1f, 50, 120)
                    .setRotationSpeed(144)
                    .setAcceleration(0.000017f, 90)
                    .emit(200, 10, 1);
            new ParticleSystem(currentActivity, 80, R.drawable.snowflake2, 10000)
                    .setSpeedModuleAndAngleRange(0f, 0.1f, 50, 120)
                    .setRotationSpeed(144)
                    .setAcceleration(0.000017f, 90)
                    .emit(600, 10, 1);
            new ParticleSystem(currentActivity, 80, R.drawable.snowflake2, 10000)
                    .setSpeedModuleAndAngleRange(0f, 0.1f, 50, 120)
                    .setRotationSpeed(144)
                    .setAcceleration(0.000017f, 90)
                    .emit(800, 10, 1);

        }else if (month.equals("March") || month.equals("April") || month.equals("May")){
            linearLayout.setBackgroundResource(R.drawable.spring);

            new ParticleSystem(currentActivity, 80, R.drawable.bee, 10000)
                    .setSpeedModuleAndAngleRange(0f, 0.1f, 200, 10)
                    .setRotationSpeed(0)
                    .setAcceleration(0.000017f, 90)
                    .emit(0, 1000, 2);
            new ParticleSystem(currentActivity, 80, R.drawable.bee, 10000)
                    .setSpeedModuleAndAngleRange(0f, 0.1f, 10, 200)
                    .setRotationSpeed(0)
                    .setAcceleration(0.000017f, 90)
                    .emit(1100, 1000, 2);

        }else if (month.equals("June") || month.equals("July") || month.equals("August")){
            linearLayout.setBackgroundResource(R.drawable.summer);

            new ParticleSystem(currentActivity, 80, R.drawable.ball, 10000)
                    .setSpeedModuleAndAngleRange(0f, 0.1f, 50, 130)
                    .setRotationSpeed(144)
                    .setAcceleration(0.000017f, 90)
                    .emit(400, 10, 1);

            new ParticleSystem(currentActivity, 80, R.drawable.ball, 10000)
                    .setSpeedModuleAndAngleRange(0f, 0.1f, 50, 120)
                    .setRotationSpeed(144)
                    .setAcceleration(0.000017f, 90)
                    .emit(200, 10, 1);
            new ParticleSystem(currentActivity, 80, R.drawable.ball, 10000)
                    .setSpeedModuleAndAngleRange(0f, 0.1f, 50, 120)
                    .setRotationSpeed(144)
                    .setAcceleration(0.000017f, 90)
                    .emit(600, 10, 1);
            new ParticleSystem(currentActivity, 80, R.drawable.ball, 10000)
                    .setSpeedModuleAndAngleRange(0f, 0.1f, 50, 120)
                    .setRotationSpeed(144)
                    .setAcceleration(0.000017f, 90)
                    .emit(800, 10, 1);
        }else{
            linearLayout.setBackgroundResource(R.drawable.fall);

            new ParticleSystem(currentActivity, 80, R.drawable.leaf, 10000)
                    .setSpeedModuleAndAngleRange(0f, 0.1f, 50, 130)
                    .setRotationSpeed(144)
                    .setAcceleration(0.000017f, 90)
                    .emit(400, 10, 1);

            new ParticleSystem(currentActivity, 80, R.drawable.leaf, 10000)
                    .setSpeedModuleAndAngleRange(0f, 0.1f, 50, 120)
                    .setRotationSpeed(144)
                    .setAcceleration(0.000017f, 90)
                    .emit(200, 10, 1);
            new ParticleSystem(currentActivity, 80, R.drawable.leaf, 10000)
                    .setSpeedModuleAndAngleRange(0f, 0.1f, 50, 120)
                    .setRotationSpeed(144)
                    .setAcceleration(0.000017f, 90)
                    .emit(600, 10, 1);
            new ParticleSystem(currentActivity, 80, R.drawable.leaf, 10000)
                    .setSpeedModuleAndAngleRange(0f, 0.1f, 50, 120)
                    .setRotationSpeed(144)
                    .setAcceleration(0.000017f, 90)
                    .emit(800, 10, 1);
        }
    }
}
