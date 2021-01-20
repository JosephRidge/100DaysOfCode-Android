package com.jayr.mabibloteque.UImain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jayr.mabibloteque.R;
import com.jayr.mabibloteque.Utility.Utils;

public class MyBooks extends AppCompatActivity  {

    RecyclerView recyclerView;
    BooksAdapter booksAdapter;
//    Book book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        recyclerView = findViewById(R.id.bookRecyclerView);
        booksAdapter = new BooksAdapter(this);


        booksAdapter.setMyBooks(Utils.getAllBooks());
        recyclerView.setAdapter(booksAdapter);
//    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

/*
    @Override
    public void addToAlreadyRead(Book book) {

    }

    @Override
    public void itemClicked(int position) {

        Intent intent = new Intent(this,AlreadyReadBooks.class);
        intent.putExtra("Name",Utils.getAlreadyReadBooks().get(position).getName());
        intent.putExtra("ImageUrl",Utils.getAlreadyReadBooks().get(position).getImageURL());
        intent.putExtra("ShortDescr",Utils.getAlreadyReadBooks().get(position).getShortDesc());
        startActivity(intent);

    }
*/}