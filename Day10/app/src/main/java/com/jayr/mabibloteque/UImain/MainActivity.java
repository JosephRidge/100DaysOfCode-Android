package com.jayr.mabibloteque.UImain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
        booksReadBtn = findViewById(R.id.btnBooksRead);
        booksCurrentBtn = findViewById(R.id.btnBooksRead);
        booksWishList = findViewById(R.id.btnBooksRead);
        booksFavourite = findViewById(R.id.btnBooksRead);
        aboutApp = findViewById(R.id.btnBooksRead);
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