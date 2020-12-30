package com.gzeinnumer.debugtrace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Debug;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss", Locale.getDefault());
        String logDate = dateFormat.format(new Date());
        // Applies the date and time to the name of the trace log.
        Debug.startMethodTracing("sample-" + logDate);
    }
}