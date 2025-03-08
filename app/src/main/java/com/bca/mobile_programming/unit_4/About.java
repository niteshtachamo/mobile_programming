package com.bca.mobile_programming.unit_4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.bca.mobile_programming.R;

public class About extends AppCompatActivity {

    private TextView aboutFullName, aboutGender, aboutCountry, aboutEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit_4_about);

        // Initialize TextViews
        aboutFullName = findViewById(R.id.aboutFullNameValue);
        aboutGender = findViewById(R.id.aboutGenderValue);
        aboutCountry = findViewById(R.id.aboutCountryValue);
        aboutEmail = findViewById(R.id.aboutEmailValue); // Added missing reference

        // Get Data from Intent
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String gender = intent.getStringExtra("GENDER");
        String country = intent.getStringExtra("COUNTRY");
        String email = intent.getStringExtra("EMAIL");  // Corrected key to match SignUp.java

        // Set Data in About Page
        aboutFullName.setText(name != null ? name : "N/A");
        aboutGender.setText(gender != null ? gender : "N/A");
        aboutCountry.setText(country != null ? country : "N/A");
        aboutEmail.setText(email != null ? email : "N/A");  // Ensure email is displayed correctly
    }


}
