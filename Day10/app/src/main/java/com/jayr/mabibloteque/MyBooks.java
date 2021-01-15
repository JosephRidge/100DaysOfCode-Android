package com.jayr.mabibloteque;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MyBooks extends AppCompatActivity {

    ArrayList<Book>myBooks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        myBooks=new ArrayList<>();

    }
}