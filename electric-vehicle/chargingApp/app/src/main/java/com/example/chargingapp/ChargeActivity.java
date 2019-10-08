package com.example.chargingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class ChargeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scheduling_page);

        Spinner myspinner = (Spinner) findViewById(R.id.time);
        ArrayAdapter<String> myadaptar = new ArrayAdapter<>(ChargeActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.times));
        myadaptar.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner.setAdapter(myadaptar);

        Spinner durationSpinner = (Spinner) findViewById(R.id.duration);
        ArrayAdapter<String> durationAdaptar = new ArrayAdapter<>(ChargeActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.durations));
        durationAdaptar.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        durationSpinner.setAdapter(durationAdaptar);
    }

        public void sendMessage(View view) {
            Intent intent = new Intent(this, ScheduledActivity.class);
            startActivity(intent);
        }

}
