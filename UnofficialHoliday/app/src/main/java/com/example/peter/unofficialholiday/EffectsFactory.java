package com.example.peter.unofficialholiday;

import android.app.Activity;

import com.plattysoft.leonids.ParticleSystem;

/**
 * Created by Howie on 8/27/2016.
 */
public class EffectsFactory {

    public void AddTopDownEffects(Activity currentActivity, int effectImage){
        new ParticleSystem(currentActivity, 80, effectImage, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.1f, 50, 130)
                .setRotationSpeed(144)
                .setAcceleration(0.000017f, 90)
                .emit(200, 10, 1);
        new ParticleSystem(currentActivity, 80, effectImage, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.1f, 50, 130)
                .setRotationSpeed(144)
                .setAcceleration(0.000017f, 90)
                .emit(400, 10, 1);
        new ParticleSystem(currentActivity, 80, effectImage, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.1f, 50, 130)
                .setRotationSpeed(144)
                .setAcceleration(0.000017f, 90)
                .emit(600, 10, 1);
        new ParticleSystem(currentActivity, 80, effectImage, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.1f, 50, 130)
                .setRotationSpeed(144)
                .setAcceleration(0.000017f, 90)
                .emit(800, 10, 1);
}

    public void AddSlideEffects(Activity currentActivity, int effectImage){
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
    }



}
