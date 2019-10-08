package com.example.chargingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MyCarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_car_page);


        Spinner myspinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> myadaptar = new ArrayAdapter<>(MyCarActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.car_models));
        myadaptar.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner.setAdapter(myadaptar);
    }
}
