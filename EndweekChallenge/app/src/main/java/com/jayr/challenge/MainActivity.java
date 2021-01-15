package com.jayr.challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.ArrayAdapter;

import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private Snackbar snackbar;
    private String passEntry ;

    private EditText email;
    private EditText password;
    private EditText passEnrty2;
    private String stringEmail;
    private String stringPass;
    private String stringPass2;
    private  RadioButton radioMale,radioFemale,radioOther;
    private RadioGroup radioGroup;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> continents = new ArrayList<>();
        spinner = findViewById(R.id.continentSpinner);
        EditText name = findViewById(R.id.userName);
        email = findViewById(R.id.userEmail);
        password = findViewById(R.id.userPassword);
        passEnrty2 = findViewById(R.id.passwordVerification);
        radioFemale = findViewById(R.id.radioBtnFemale);
        radioMale = findViewById(R.id.radioBtnMale);
        radioOther = findViewById(R.id.radioBtnOther);

        continents.add("Africa");
        continents.add("Antarctica");
        continents.add("Asia");
        continents.add("Australia");
        continents.add("Europe");
        continents.add("North America");
        continents.add("South America");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(
                this,
                R.layout.continents_list,
                continents);

        spinner.setAdapter(arrayAdapter);

        String stringName = name.getText().toString().trim();
        stringEmail = email.getText().toString().trim();
        stringPass = password.getText().toString().trim();
        stringPass2 = passEnrty2.getText().toString().trim();

        //    VALIDATION

        if (stringName.isEmpty()) {
            name.setError(" Kindly input your name !!");
            name.requestFocus();
            return;
        }
        if (stringEmail.isEmpty()) {
            email.setError("Kindly input your Email !!");
            email.requestFocus();
            return;
        }
        if (stringPass.isEmpty()) {
            password.setError(" Kindly input your password!!");
            password.requestFocus();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(stringEmail).matches()) {
            email.setError("Kindly input your correct email!!");
        }
        if (stringPass.isEmpty()) {
            password.setError("You need me for security !!");
            password.requestFocus();
            return;
        }

        if (stringPass.length() < 8) {
            password.setError("Minimun legnth is 8");
            password.requestFocus();
        }
        if( radioMale.isChecked()){
            Toast.makeText(this, "Male Checked!", Toast.LENGTH_SHORT).show();
        }
        else if( radioFemale.isChecked()){
            Toast.makeText(this, "Female Checked!", Toast.LENGTH_SHORT).show();

        }
        else if( radioOther.isChecked()){
            Toast.makeText(this, "Other Checked!", Toast.LENGTH_SHORT).show();

        }


// TODO : work on the POJO and Logic of getting user input selecting items in spinner and buttons(normal and radio)

    }
}