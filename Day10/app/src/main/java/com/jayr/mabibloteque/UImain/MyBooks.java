package com.jayr.mabibloteque.UImain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jayr.mabibloteque.BooksAdapter;
import com.jayr.mabibloteque.Model.Book;
import com.jayr.mabibloteque.R;
import com.jayr.mabibloteque.Utility.Utils;

import java.util.ArrayList;

public class MyBooks extends AppCompatActivity implements BooksAdapter.BookActionSelected {

    RecyclerView recyclerView;
    BooksAdapter booksAdapter;
//    Book book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        recyclerView = findViewById(R.id.bookRecyclerView);
        booksAdapter = new BooksAdapter(this,this);


        booksAdapter.setMyBooks(Utils.getAllBooks());
        recyclerView.setAdapter(booksAdapter);
//    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public void addToAlreadyRead(Book book) {

    }
}