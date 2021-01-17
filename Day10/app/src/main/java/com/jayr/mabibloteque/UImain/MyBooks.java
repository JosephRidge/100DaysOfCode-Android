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

import java.util.ArrayList;

public class MyBooks extends AppCompatActivity {

    ArrayList<Book>myBooks;
    RecyclerView recyclerView;
    BooksAdapter booksAdapter;
    Book book;

    private ImageView imageBook2;
    private TextView bookName2, bookAuthor2;
    private TextView bookDescription2;

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
        myBooks.add(new Book(
                "A002",
                "Human + Machine",
                "Paul R. Daugherty and H. James Wilson",
                264,
                "https://www.uxmatters.com/mt/archives/2019/02/images/Cover_Human+Machine.png",
                "The authors' goal in publishing Human + Machine is to help executives, workers, " +
                        "students and others navigate the changes that AI is making to business and the economy. " +
                        "They believe AI will bring innovations that truly improve the way the world works and lives." +
                        " However, AI will cause disruption, and many people will need education, training and support " +
                        "to prepare for the newly created jobs. To support this need, the authors are donating the royalties " +
                        "received from the sale of this book to" +
                        " fund education and retraining programs focused on developing fusion skills " +
                        "for the age of artificial intelligence.",
                "Look around you. Artificial intelligence is no longer just a futuristic notion. " +
                        "It's here right now--in software that senses what we need, supply chains that \"think\" " +
                        "in real time, and robots that respond to changes in their environment. Twenty-first-century " +
                        "pioneer companies are already using AI to innovate and grow fast. The bottom line is this: Businesses " +
                        "that understand how to harness AI can surge ahead." +
                        " Those that neglect it will fall behind. Which side are you on?")
        );


        booksAdapter.setMyBooks(myBooks);
        recyclerView.setAdapter(booksAdapter);
//    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}