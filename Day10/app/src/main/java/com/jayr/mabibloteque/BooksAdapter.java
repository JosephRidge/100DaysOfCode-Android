package com.jayr.mabibloteque;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BooksAdapter {

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageUrl;
        private TextView BookName;
        private String shortDesc;
        private String longDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageUrl = itemView.findViewById(R.id.imgBook);
            BookName = itemView.findViewById(R.id.bookName);


        }
    }
}
