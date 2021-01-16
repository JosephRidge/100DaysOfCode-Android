package com.jayr.mabibloteque;

import android.content.Context;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.TransitionManager;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.ViewHolder>{

    ArrayList<Book>myBooks = new ArrayList<>();


    Context context;
    public BooksAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.book,parent, false);
        ViewHolder holder =new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bookName.setText(myBooks.get(position).getName());
        Glide.with(context)
                .asBitmap()
                .load(myBooks.get(position).getImageURL()).
                into(holder.imageUrl);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, myBooks.get(position).getName()+" Book Selected !", Toast.LENGTH_SHORT).show();
            }
        });
        holder.bookAuthor.setText(myBooks.get(position).getAuthor());
        holder.bookDescription.setText(myBooks.get(position).getShortDesc());
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


    }

    @Override
    public int getItemCount() {
        return myBooks.size();
    }

    public void setMyBooks(ArrayList<Book> myBooks) {
        this.myBooks = myBooks;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageUrl;
        private TextView bookName;
        private CardView cardView;
        private ImageView expandContent, minmizeContent;
        private RelativeLayout expandedView;
        private TextView bookAuthor,bookDescription;
//        private String shortDesc;
//        private String longDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageUrl = itemView.findViewById(R.id.imgBook);
            bookName = itemView.findViewById(R.id.bookName);
            cardView = itemView.findViewById(R.id.cardViewParent);

            bookAuthor = itemView.findViewById(R.id.author);
            bookDescription = itemView.findViewById(R.id.shortDesc);
            expandContent = itemView.findViewById(R.id.expandView);
            minmizeContent = itemView.findViewById(R.id.minimizedView);
            expandedView = itemView.findViewById(R.id.relLayoutExpanded);

        }
    }
}
