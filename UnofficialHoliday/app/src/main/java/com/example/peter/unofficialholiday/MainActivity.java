package com.example.peter.unofficialholiday;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.RelativeLayout;

import java.util.Calendar;
import java.util.HashMap;

import com.plattysoft.leonids.ParticleSystem;


public class MainActivity extends ActionBarActivity {

    private DayInfoFinder dayInfoFinder = new DayInfoFinder();
    private BackgroundSetter backgroundSetter = new BackgroundSetter();
    private final Calendar cal = Calendar.getInstance();
    private MonthChecker monthChecker = new MonthChecker();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //   AdView mAdView = (AdView) findViewById(R.id.ad_view);
     // AdRequest adRequest = new AdRequest.Builder()
                //.addTestDevice("YOUR_DEVICE_HASH")
     //           .setGender(AdRequest.GENDER_FEMALE)
     //           .tagForChildDirectedTreatment(true)
     //           .build();
     //   mAdView.loadAd(adRequest);

        SetUpMonth();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            showAbout();
        }

        return super.onOptionsItemSelected(item);
    }

    //Shows the about activity
    private void showAbout(){
        Intent intent = new Intent(MainActivity.this, aboutActivity.class);
        startActivity(intent);
    }

    private void SetUpMonth(){
        String day = dayInfoFinder.FindDay();
        TextView monthInfoTextBox = (TextView)findViewById(R.id.text);
        monthInfoTextBox.setText(day);

        RelativeLayout linearLayout = (RelativeLayout) findViewById(R.id.linearLayoutid);
        backgroundSetter.setBackground(monthChecker.checkMonth(cal), this, linearLayout);
    }
}
