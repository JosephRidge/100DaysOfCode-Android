package com.jayr.challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import android.widget.EditText;
import android.widget.Spinner;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    Snackbar snackbar;
    String passEntry ;
    EditText name, email, password, passEnrty2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String>continents = new ArrayList<>();
        spinner  = findViewById(R.id.continentSpinner);
        name = findViewById(R.id.userName);
        email= findViewById(R.id.userEmail);
        password = findViewById(R.id.userPassword);
        passEnrty2 = findViewById(R.id.passwordVerification);

        continents.add("Africa");
        continents.add("Antarctica");
        continents.add( "Asia");
        continents.add("Australia");
        continents.add("Europe");
        continents.add("North America");
        continents.add("South America");

        ArrayAdapter<String> ListAdapter = new ArrayAdapter(
                this,
                R.layout.continents_list,
                continents);

        spinner.setAdapter(ListAdapter);

        if()


// TODO : work on the POJO and Logic of getting user input selecting items in spinner and buttons(normal and radio)

    }
}