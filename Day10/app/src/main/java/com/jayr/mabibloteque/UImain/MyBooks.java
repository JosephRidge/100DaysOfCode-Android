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

public class MyBooks extends AppCompatActivity {

//    ArrayList<Book>myBooks;
    RecyclerView recyclerView;
    BooksAdapter booksAdapter;
//    Book book;

    private ImageView imageBook2;
    private TextView bookName2, bookAuthor2;
    private TextView bookDescription2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        recyclerView = findViewById(R.id.bookRecyclerView);
        booksAdapter = new BooksAdapter(this);


        booksAdapter.setMyBooks(Utils.getInstance().getAllBooks());
        recyclerView.setAdapter(booksAdapter);
//    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}