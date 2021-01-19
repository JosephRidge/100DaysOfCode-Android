package com.jayr.mabibloteque.UImain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jayr.mabibloteque.BooksAdapter;
import com.jayr.mabibloteque.Model.Book;
import com.jayr.mabibloteque.R;
import com.jayr.mabibloteque.Utility.Utils;

public class AlreadyReadBooks extends AppCompatActivity implements BooksAdapter.BookActionSelected {

    private RecyclerView recyclerView;
    private ImageView imageBook;
    private TextView bookName, bookAuthor;
    private TextView bookDescription;
    private Button btnAddToAlreadyRead;
    private BooksAdapter booksAdapter;
    private String position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_already_read_book);


        recyclerView = findViewById(R.id.alreadyReadBooks);

        booksAdapter = new BooksAdapter(this,this);


        booksAdapter.setMyBooks(Utils.getAlreadyReadBooks());

//      recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(booksAdapter);
//        btnAddToAlreadyRead = findViewById(R.id.alreadyRead);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



//    recyclerView.setLayoutManager(new LinearLayoutManager(this));
 /*
//        Bundle bundle = getIntent().getExtras();
        Intent intent = getIntent();
        if (intent.getExtras()!= null){
            Book book = (Book)intent.getSerializableExtra("Data");

            Glide.with(this)
                    .asBitmap()
                    .load(book.getImageURL()).
                    into(imageBook);
            bookName.setText(book.getName());
            bookAuthor.setText(book.getAuthor());
            bookDescription.setText(book.getLongDesc());
        }
       position = bundle.getString("id", "-1");
        if (position != "-1") {
            Book selectedBook = Utils.getInstance().getBookById(position);
            if (null != selectedBook) {
                Glide.with(this)
                        .asBitmap()
                        .load(Utils.getInstance().getBookById(position).getImageURL()).
                        into(imageBook);

                bookAuthor.setText(Utils.getInstance().getBookById(position).getAuthor());
                bookName.setText(Utils.getInstance().getBookById(position).getName());
                bookDescription.setText(Utils.getInstance().getBookById(position).getLongDesc());



            }
        }*/
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(AlreadyReadBooks.this,MainActivity.class);
        intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TASK | intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    @Override
    public void addToAlreadyRead(Book book) {

    }

}