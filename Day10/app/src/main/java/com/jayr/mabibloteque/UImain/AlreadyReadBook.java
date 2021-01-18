package com.jayr.mabibloteque.UImain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.jayr.mabibloteque.BooksAdapter;
import com.jayr.mabibloteque.R;
import com.jayr.mabibloteque.Utility.Utils;

public class AlreadyReadBook extends AppCompatActivity {

    private RecyclerView recyclerView;
    private BooksAdapter booksAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_already_read_book);


        recyclerView = findViewById(R.id.bookRecyclerView);
        booksAdapter = new BooksAdapter(this);


        booksAdapter.setMyBooks(Utils.getInstance().getAlreadyReadBooks());

        recyclerView.setAdapter(booksAdapter);
//    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(AlreadyReadBook.this,MainActivity.class);
        intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TASK | intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}