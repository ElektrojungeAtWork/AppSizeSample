package de.elektrojunge.android.samplesizeapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button trackMeButtonn = findViewById(R.id.trackMeButton);
        Button crashButton = findViewById(R.id.crashMeButton);

    }
}
