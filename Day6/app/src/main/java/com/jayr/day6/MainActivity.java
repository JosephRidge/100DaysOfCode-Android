package com.jayr.day6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<String> userMusic = new ArrayList<>();
        userMusic.add("Green Day - Walk Alone.");
        userMusic.add("Linking Park - In The End.");
        userMusic.add("Linkin Park - Breaking a Habit");
        userMusic.add("The Script - I'm Stilll Alive");
        userMusic.add("Swedish House Mafia - Don't you Wprry Child.");
        userMusic.add("Daughtry - Life After You");
        userMusic.add("Evanscence - Stronger");

        ArrayList<String> Artists = new ArrayList<>();
        Artists.add("Green Day");
        Artists.add("Linkin Park");
        Artists.add("Daughtry");
        Artists.add("The Script");
        Artists.add("The Creed");
        Artists.add("Evanscence ");

        ArrayAdapter<String>ListAdapter = new ArrayAdapter(
                this,
                R.layout.list_view_activity,
                userMusic);
        ArrayAdapter<String>SpinnerAdapter = new ArrayAdapter(
                this,
                R.layout.support_simple_spinner_dropdown_item,
                Artists
        );
    }
}