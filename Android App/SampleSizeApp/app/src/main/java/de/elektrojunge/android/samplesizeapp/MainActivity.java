package de.elektrojunge.android.samplesizeapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.distribute.Distribute;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button trackMeButton = findViewById(R.id.trackMeButton);
        trackMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Analytics.trackEvent("test event");
            }
        });
        Button crashButton = findViewById(R.id.crashMeButton);
        crashButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Crashes.generateTestCrash();
            }
        });

        AppCenter.setLogLevel(Log.VERBOSE);
        AppCenter.start(getApplication(), "55efc107-ee0c-40e4-a4e7-e4f283b59b2e", Distribute.class);

    }
}
