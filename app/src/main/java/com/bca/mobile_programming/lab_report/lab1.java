package com.bca.mobile_programming.lab_report;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.bca.mobile_programming.R;

public class lab1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab_1_mp);

        // Button setup
        Button aboutButton = findViewById(R.id.myButton);
        aboutButton.setOnClickListener(view ->
                Toast.makeText(this, "Button Clicked!", Toast.LENGTH_SHORT).show()
        );

        // Spinner setup
        Spinner countrySpinner = findViewById(R.id.constraintCountrySpinner);
        String[] countryList = {"Nepal", "Netherlands", "United Kingdom", "Germany"};

        ArrayAdapter<String> countryAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item, countryList
        );
        countryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        countrySpinner.setAdapter(countryAdapter);
    }
}

