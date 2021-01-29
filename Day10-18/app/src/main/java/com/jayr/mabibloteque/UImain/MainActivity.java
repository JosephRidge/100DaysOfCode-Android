package com.jayr.mabibloteque.UImain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import com.jayr.mabibloteque.R;
import com.jayr.mabibloteque.Utility.Utils;

public class MainActivity extends AppCompatActivity {

    Button booksButton, booksReadBtn, booksCurrentBtn,booksWishList,booksFavourite,aboutApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        booksButton =findViewById(R.id.btnBooks);
        booksReadBtn = findViewById(R.id.btnAlreadyRead);
        booksCurrentBtn = findViewById(R.id.btnBooksCurrentRead);
        booksWishList = findViewById(R.id.btnBookWishlist);
        booksFavourite = findViewById(R.id.btnBooksFavourite);
        aboutApp = findViewById(R.id.btnAbout);


        booksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,MyBooks.class);
                startActivity(i);
            }
        });
        booksReadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AlreadyReadBooks.class);
                startActivity(i);
            }
        });
        booksCurrentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CurrentBookRead.class);
                startActivity(i);
            }
        });
        booksWishList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, BookWishList.class);
                startActivity(i);
            }
        });
        booksFavourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, FavouriteBooks.class);
                startActivity(i);
            }
        });
        aboutApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, About.class);
                startActivity(i);
            }
        });
        Utils.getInstance();
    }
}