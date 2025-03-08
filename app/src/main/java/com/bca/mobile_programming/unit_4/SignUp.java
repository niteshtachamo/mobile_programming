package com.bca.mobile_programming.unit_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.CheckBox;
import androidx.appcompat.app.AppCompatActivity;

import com.bca.mobile_programming.R;

public class SignUp extends AppCompatActivity {

    private EditText etFullName, etEmail, etPhone, etPassword;
    private RadioGroup rgGender;
    private Spinner spCountry;
    private CheckBox chkTerms;
    private Button btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab_1_mp); // Ensure this is the correct layout file for your signup page

        // Initialize fields using the correct IDs from your layout
        etFullName = findViewById(R.id.inputName);
        etEmail = findViewById(R.id.inputEmail);
        etPhone = findViewById(R.id.inputPhone);
        etPassword = findViewById(R.id.inputPassword);
        rgGender = findViewById(R.id.constraintRadioGroupGender);  // For Gender Radio buttons
        spCountry = findViewById(R.id.constraintCountrySpinner);  // For Country Spinner
        chkTerms = findViewById(R.id.termsCheckBox);
        btnSignup = findViewById(R.id.myButton);  // Signup Button

        // Set button click listener
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get user input from EditText
                String name = etFullName.getText().toString().trim();
                String email = etEmail.getText().toString().trim();
                String phone = etPhone.getText().toString().trim();
                String password = etPassword.getText().toString().trim();

                // Get selected gender
                int selectedGenderId = rgGender.getCheckedRadioButtonId();
                RadioButton selectedGender = findViewById(selectedGenderId);
                String gender = selectedGender != null ? selectedGender.getText().toString() : "Not selected";

                // Get selected country
                String country = spCountry.getSelectedItem().toString();

                // Check if terms and conditions are accepted
                boolean termsAccepted = chkTerms.isChecked();

                // Create Intent to start About activity and send the data
                Intent intent = new Intent(SignUp.this, About.class);
                intent.putExtra("NAME", name);
                intent.putExtra("EMAIL", email);
                intent.putExtra("PHONE", phone);
                intent.putExtra("PASSWORD", password);
                intent.putExtra("GENDER", gender);
                intent.putExtra("COUNTRY", country);
                intent.putExtra("TERMS_ACCEPTED", termsAccepted);

                // Start About activity
                startActivity(intent);
            }
        });
    }
}

