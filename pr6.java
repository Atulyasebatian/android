package com.example.prog6;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etName, etEmail, etPassword;
    RadioButton rbMale, rbFemale;
    CheckBox cbTerms;
    Switch switch1; // 🔄 Declare the Switch
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Linking UI controls
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        rbMale = findViewById(R.id.rbMale);
        rbFemale = findViewById(R.id.rbFemale);
        cbTerms = findViewById(R.id.cbTerms);
        switch1 = findViewById(R.id.switch1); // 🔄 Link the Switch
        btnSubmit = findViewById(R.id.btnSubmit);

        // Set button click listener
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateForm();
            }
        });
    }

    private void validateForm() {
        // Name Validation
        if (TextUtils.isEmpty(etName.getText().toString())) {
            etName.setError("Name is required");
            return;
        }

        // Email Validation
        if (!Patterns.EMAIL_ADDRESS.matcher(etEmail.getText().toString()).matches()) {
            etEmail.setError("Enter a valid email");
            return;
        }

        // Password Validation
        if (etPassword.getText().toString().length() < 6) {
            etPassword.setError("Password must be at least 6 characters");
            return;
        }

        // Gender Validation
        if (!rbMale.isChecked() && !rbFemale.isChecked()) {
            Toast.makeText(this, "Select your gender", Toast.LENGTH_SHORT).show();
            return;
        }

        // Terms Checkbox Validation
        if (!cbTerms.isChecked()) {
            Toast.makeText(this, "Please accept Terms & Conditions", Toast.LENGTH_SHORT).show();
            return;
        }

        // 🔄 Switch Validation
        if (!switch1.isChecked()) {
            Toast.makeText(this, "Switch is not enabled", Toast.LENGTH_SHORT).show();
            return;
        }

        // If all validations pass
        Toast.makeText(this, "Form Submitted Successfully!", Toast.LENGTH_LONG).show();
    }
}

