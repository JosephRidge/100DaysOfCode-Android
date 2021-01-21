package com.jayr.mabibloteque.UImain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.jayr.mabibloteque.R;
import com.jayr.mabibloteque.Utility.Utils;

public class BookWishList extends AppCompatActivity {
    RecyclerView recyclerView;
    BooksAdapter booksAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_wish_list);


        recyclerView = findViewById(R.id.booksWishList);
        booksAdapter = new BooksAdapter(this);



        booksAdapter.setMyBooks(Utils.getBookWishList());
        System.out.println(" ******** Jay_R : \n"+Utils.getBookWishList()+" \n******** Jay_R : ");//debugging purposes


//      recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(booksAdapter);
//        btnAddToAlreadyRead = findViewById(R.id.alreadyRead);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(BookWishList.this,MainActivity.class);
        intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TASK | intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}