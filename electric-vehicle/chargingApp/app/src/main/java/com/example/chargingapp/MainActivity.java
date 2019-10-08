package com.example.chargingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private Button driveButton;
    private Button chargeButton;
    private Button myCarButton;
    private Button settingsButton;
    private FloatingActionButton helpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        driveButton = (Button) findViewById(R.id.driveButton);
        driveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDrivePage();
            }
        });

        chargeButton = (Button) findViewById(R.id.chargeButton);
        chargeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChargePage();
            }
        });

        myCarButton = (Button) findViewById(R.id.myCarButton);
        myCarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyCarPage();
            }
        });

        settingsButton = (Button) findViewById(R.id.settingsButton);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettingsPage();
            }
        });

        helpButton = (FloatingActionButton) findViewById(R.id.helpButton);
        helpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHelpPage();
            }
        });


    }

    public void openDrivePage() {
        Intent intent = new Intent(this, DriveActivity.class);
        startActivity(intent);
    }

    public void openChargePage() {
        Intent intent = new Intent(this, ChargeActivity.class);
        startActivity(intent);
    }

    public void openMyCarPage() {
        Intent intent = new Intent(this, MyCarActivity.class);
        startActivity(intent);
    }

    public void openSettingsPage() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    public void openHelpPage() {
        Intent intent = new Intent(this, HelpCenter.class);
        startActivity(intent);
    }

}
