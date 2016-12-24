package com.example.peter.unofficialholiday.Interfaces;

import android.app.Activity;

/**
 * Created by peter on 12/11/2016.
 */

public interface IEffectsFactory {
    void AddTopDownEffects(Activity currentActivity, int effectImage);
    void AddSlideEffects(Activity currentActivity, int effectImage);
}
