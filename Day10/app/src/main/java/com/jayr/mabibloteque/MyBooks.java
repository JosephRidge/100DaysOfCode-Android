package com.jayr.mabibloteque;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MyBooks extends AppCompatActivity {

    ArrayList<Book>myBooks;
    RecyclerView recyclerView;
    BooksAdapter booksAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        myBooks=new ArrayList<>();
        recyclerView = findViewById(R.id.bookRecyclerView);
        booksAdapter = new BooksAdapter(this);

        myBooks.add(new Book("A001",
                "Laws Of Human Nature",
                "Robert Greene",
                588,
                "https://images-na.ssl-images-amazon.com/images/I/71OMelbI6sL.jpg",
                "Robert Greene is a master guide for millions of readers," +
                        " distilling ancient wisdom and philosophy into essential texts for seekers of power," +
                        " understanding and mastery. Now he turns to the most important subject of all " +
                        "- understanding people's drives and motivations," +
                        " even when they are unconscious of them themselves.",
                "We are social animals. Our very lives depend on our relationships with people." +
                        " Knowing why people do what they do is the most important tool we can possess," +
                        " without which our other talents can only take us so far." +
                        " Drawing from the ideas and examples of Pericles, Queen Elizabeth I," +
                        " Martin Luther King Jr, and many others, Greene teaches us how to detach ourselves" +
                        " from our own emotions and master self-control, how to develop the empathy that leads to insight, " +
                        "how to look behind people's masks, and how to resist conformity to develop your singular sense of purpose." +
                        " Whether at work, in relationships, or in shaping the world around you," +
                        " The Laws of Human Nature offers brilliant tactics for success, self-improvement, and self-defense."));

        booksAdapter.setMyBooks(myBooks);
        recyclerView.setAdapter(booksAdapter);
//    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
    }
}