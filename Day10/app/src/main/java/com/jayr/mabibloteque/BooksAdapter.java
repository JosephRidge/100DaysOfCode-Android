package com.jayr.mabibloteque;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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
//        private String shortDesc;
//        private String longDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageUrl = itemView.findViewById(R.id.imgBook);
            bookName = itemView.findViewById(R.id.bookName);

        }
    }
}
