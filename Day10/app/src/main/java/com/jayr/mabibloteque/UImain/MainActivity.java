package com.jayr.mabibloteque.UImain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jayr.mabibloteque.R;
import com.jayr.mabibloteque.Utility.Utils;

public class MainActivity extends AppCompatActivity {

    Button booksButton, booksReadBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        booksButton =findViewById(R.id.btnBooks);
        booksReadBtn = findViewById(R.id.btnBooksRead);

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
        Utils.getInstance();
    }
}