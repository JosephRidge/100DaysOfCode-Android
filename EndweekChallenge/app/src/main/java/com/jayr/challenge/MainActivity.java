package com.jayr.challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
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
        spinner.

    }
}