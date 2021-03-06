package com.jayr.mabibloteque.UImain;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.TransitionManager;

import com.bumptech.glide.Glide;
import com.jayr.mabibloteque.Model.Book;
import com.jayr.mabibloteque.R;
import com.jayr.mabibloteque.Utility.Utils;

import java.util.ArrayList;

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.ViewHolder>{

    ArrayList<Book>myBooks;

    Context context;
    String parentActivity;

    public BooksAdapter(Context context, String parentActivity) {
        this.context = context;
        this.parentActivity = parentActivity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.book,parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

         holder.bookName.setText(myBooks.get(position).getName());
            Glide.with(context)
                    .asBitmap()
                    .load(myBooks.get(position).getImageURL()).
                    into(holder.imageUrl);


        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, myBooks.get(position).getName()
                        +" Book Selected !", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(context,BookAcitivity.class);
                intent.putExtra("id",myBooks.get(position).getId());
                context.startActivity(intent);

            }
        });
        holder.bookAuthor.setText(myBooks.get(position).getAuthor());
        holder.bookDescription.setText(Utils.getAllBooks().get(position).getShortDesc());

        holder.expandContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(holder.cardView);//adds animation
                holder.expandedView.setVisibility(v.VISIBLE);
                holder.expandContent.setVisibility(v.GONE);
                notifyItemChanged(position);
            }
        });
        holder.minmizeContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.expandedView.setVisibility(v.GONE);
                holder.expandContent.setVisibility(v.VISIBLE);

            }
        });
            if(parentActivity.equals("allBooks")){
                holder.deleteItem.setVisibility(View.GONE);

            }else if(parentActivity.equals("currentBooks")){
                holder.deleteItem.setVisibility(View.VISIBLE);
                holder.deleteItem.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
                      alertDialog.setMessage("Are you sure your would like to remove this from your Current Books List ?");
                      alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                          @Override
                          public void onClick(DialogInterface dialog, int which) {
                              if(Utils.getInstance().RemoveFromCurrentReads(myBooks.get(position))){
                                  Toast.makeText(context, "Book Removed from current Reads !", Toast.LENGTH_SHORT).show();
                                  notifyDataSetChanged();
                              }else{
                                  Toast.makeText(context, "Opps! Something went wrong..", Toast.LENGTH_SHORT).show();
                              }
                          }
                      });
                      alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                          @Override
                          public void onClick(DialogInterface dialog, int which) {
                              Toast.makeText(context, "Great Choice..", Toast.LENGTH_SHORT).show();

                          }
                      });

                  }
              });

            }
            else if(parentActivity.equals("alreadyReadBooks")){
                holder.deleteItem.setVisibility(View.VISIBLE);
                holder.deleteItem.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
                        alertDialog.setMessage("Are you sure your would like to remove this from your Already Read Books List ?");
                        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                if(Utils.getInstance().RemoveFromAlreadyAdded(myBooks.get(position))){
                                    Toast.makeText(context, "Book Removed from Already Read Books !", Toast.LENGTH_SHORT).show();
                                    notifyDataSetChanged();
                                }else{
                                    Toast.makeText(context, "Opps! Something went wrong..", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                        alertDialog.setPositiveButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(context, "Great Choice..", Toast.LENGTH_SHORT).show();

                            }
                        });
                    }
                });
            }
            else if(parentActivity.equals("bookWishList")){
                holder.deleteItem.setVisibility(View.VISIBLE);
                holder.deleteItem.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
                        alertDialog.setMessage("Are you sure your would like to remove this from your Book Wish List ?");
                        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                if(Utils.getInstance().RemoveFromWishList(myBooks.get(position))){
                                    Toast.makeText(context, "Book Removed from Wish List !", Toast.LENGTH_SHORT).show();
                                    notifyDataSetChanged();

                                }else{
                                    Toast.makeText(context, "Opps! Something went wrong..", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(context, "Great Choice..", Toast.LENGTH_SHORT).show();

                            }
                        });

                    }
                });
            }
            else if(parentActivity.equals("favouriteBooks")){
                holder.deleteItem.setVisibility(View.VISIBLE);
                holder.deleteItem.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
                        alertDialog.setMessage("Are you sure your would like to remove this from your Favourites ?");
                        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                if(Utils.getInstance().RemoveFromFavourites(myBooks.get(position))){
                                    Toast.makeText(context, "Book Removed from Favorites !", Toast.LENGTH_SHORT).show();
                                    notifyDataSetChanged();

                                }else{
                                    Toast.makeText(context, "Opps! Something went wrong..", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                       alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialog, int which) {

                           }
                       });
                    }
                });
            }

    }

    @Override
    public int getItemCount() {
        return myBooks.size();
    }

    /*
    * Interface ....
    * */

    public void setMyBooks(ArrayList<Book> myBooks) {
        this.myBooks = myBooks;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageUrl,imageBook2;
        private TextView bookName,bookName2, bookAuthor2;
        private CardView cardView;
        private ImageView expandContent, minmizeContent;
        private RelativeLayout expandedView;
        private TextView bookAuthor,bookDescription,bookDescription2;

        private Button viewReadBooks;
        private TextView deleteItem;
//        private String shortDesc;

//        private String longDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageUrl = itemView.findViewById(R.id.imgBook);
            bookName = itemView.findViewById(R.id.bookName);
            bookName2 = itemView.findViewById(R.id.bookName2);
            cardView = itemView.findViewById(R.id.cardViewParent);


            bookAuthor2 = itemView.findViewById(R.id.bookAuthor2);
            bookAuthor = itemView.findViewById(R.id.bookAuthor1);
            bookDescription = itemView.findViewById(R.id.shortDesc);
            bookDescription2 = itemView.findViewById(R.id.bookDescription2);
            expandContent = itemView.findViewById(R.id.expandView);
            minmizeContent = itemView.findViewById(R.id.minimizedView);
            expandedView = itemView.findViewById(R.id.relLayoutExpanded);

            deleteItem = itemView.findViewById(R.id.deleteItem);

        }
    }
}
