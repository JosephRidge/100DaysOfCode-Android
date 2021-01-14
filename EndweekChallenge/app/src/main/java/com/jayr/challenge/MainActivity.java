package com.jayr.challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import android.widget.Spinner;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String>continents = new ArrayList<>();
        spinner  = findViewById(R.id.continentSpinner);

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
// TODO : work on the POJO and Logic of getting user input selecting items in spinner and buttons(normal and radio)
    }
}