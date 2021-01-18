package com.jayr.mabibloteque;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.jayr.mabibloteque.Model.Book;
import com.jayr.mabibloteque.UImain.AlreadyReadBook;
import com.jayr.mabibloteque.UImain.MainActivity;
import com.jayr.mabibloteque.Utility.Utils;

import java.util.ArrayList;

public class BookAcitivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Book book;

    private ImageView imageBook2;
    private TextView bookName2, bookAuthor2;
    private TextView bookDescription2;
    private Button btnAddToAlreadyRead;
    private Button btnWishList;
    private Button btnAddtoFavourites;
    private Button btnCurrentReads;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_acitvity);


        recyclerView = findViewById(R.id.bookRecyclerView);


        imageBook2 = findViewById(R.id.imageBk);
        bookName2 = findViewById(R.id.bookName2);

        bookAuthor2 = findViewById(R.id.bookAuthor2);
        bookDescription2 = findViewById(R.id.bookDescription2);

        btnAddToAlreadyRead = findViewById(R.id.alreadyRead);
        btnCurrentReads = findViewById(R.id.currentReads);
        btnAddtoFavourites = findViewById(R.id.addToFav);
        btnWishList = findViewById(R.id.wishList);




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

                handleAlreadyRead(selectedBook);

            }
        }
  }

  /*
  * Enable Disable button Add to AlreadyREAD
  * Add book to AlreadyRead list
  * @param book
  * */
      public void handleAlreadyRead(Book book){

        ArrayList<Book> alreadyReadBooks = Utils.getInstance().getAlreadyReadBooks();

        Boolean alreadyAdded = false;
          for (Book b: alreadyReadBooks ) {
              if (b.getId() == book.getId()){
                  alreadyAdded = true;
              }
          }
          if(alreadyAdded){
              btnAddToAlreadyRead.setEnabled(false);
          }else{
              btnAddToAlreadyRead.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                     if (Utils.getInstance().AddToAlreadyAdded(book)){
                         Toast.makeText(BookAcitivity.this, "Book Added", Toast.LENGTH_SHORT).show();
                         Intent intent = new Intent(BookAcitivity.this, MainActivity.class);
                         startActivity(intent);
                     }
                     else
                     {
                         Toast.makeText(BookAcitivity.this, "Ooops! Something happened, try again..", Toast.LENGTH_SHORT).show();
                     }
                  }
              });
          }

      }


    /*
     * Enable Disable Add to CurrentReads
     * Add book to AlreadyRead list
     * @param book
     * */
      public void handleCurrentReads(Book book){}


    /*
     * Enable Disable Add to WishList
     * Add book to AlreadyRead list
     * @param book
     * */
      public void handleWishList(Book book){}

    /*
     * Enable Disable Add to FavouriteBooks
     * Add book to AlreadyRead list
     * @param book
     * */
      public void handleFavouriteBooks(Book book){}


}