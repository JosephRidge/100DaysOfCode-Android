package com.jayr.mabibloteque;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.util.Util;
import com.jayr.mabibloteque.Model.Book;
import com.jayr.mabibloteque.Utility.Utils;

import java.util.ArrayList;

public class BookAcitivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Book book;

    private ImageView imageBook2;
    private TextView bookName2, bookAuthor2;
    private TextView bookDescription2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_acitvity);


        recyclerView = findViewById(R.id.bookRecyclerView);


        imageBook2 = findViewById(R.id.imageBk);
        bookName2 = findViewById(R.id.bookName2);

        bookAuthor2 = findViewById(R.id.bookAuthor2);
        bookDescription2 = findViewById(R.id.bookDescription2);




        /* This section of code is amazing !! using the Bundle
        i was able to transfer or rather share the value of a variable from one activity to the next  */

        Bundle bundle = getIntent().getExtras();
        String position = bundle.getString("id","-1");
        if(position != "-1"){
            Book  selectedBook = Utils.getInstance().getBookById(position);
            if (null != selectedBook){
                Glide.with(this)
                        .asBitmap()
                        .load(Utils.getInstance().getBookById(position).getImageURL()).
                        into(imageBook2);

                bookAuthor2.setText(Utils.getInstance().getBookById(position).getAuthor());
                bookName2.setText(Utils.getInstance().getBookById(position).getName());
                bookDescription2.setText(Utils.getInstance().getBookById(position).getLongDesc());

            }
        }



  }
}