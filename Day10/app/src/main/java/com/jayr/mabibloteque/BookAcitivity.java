package com.jayr.mabibloteque;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jayr.mabibloteque.Model.Book;

import java.util.ArrayList;

public class BookAcitivity extends AppCompatActivity {
    ArrayList<Book>myBooks;
    RecyclerView recyclerView;
    Book book;

    private ImageView imageBook2;
    private TextView bookName2, bookAuthor2;
    private TextView bookDescription2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_acitvity);

        myBooks=new ArrayList<>();
        recyclerView = findViewById(R.id.bookRecyclerView);


        imageBook2 = findViewById(R.id.imageBk);
        bookName2 = findViewById(R.id.bookName2);

        bookAuthor2 = findViewById(R.id.bookAuthor2);
        bookDescription2 = findViewById(R.id.bookDescription2);



        /* This section of code is amazing !! using the Bundle
        i was able to transfer or rather share the value of a variable from one activity to the next  */

        Bundle bundle = getIntent().getExtras();
        Integer position = bundle.getInt("position");

        Glide.with(this)
                .asBitmap()
                .load(myBooks.get(position).getImageURL()).
                into(imageBook2);

        bookAuthor2.setText(myBooks.get(position).getAuthor());
        bookName2.setText(myBooks.get(position).getName());
        bookDescription2.setText(myBooks.get(position).getLongDesc());
    }
}