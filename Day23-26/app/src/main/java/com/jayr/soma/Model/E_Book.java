package com.jayr.soma.Model;

import android.widget.ImageView;

public class E_Book {
    private String bookTitle;
    private String shortBookDesc;
    private ImageView imageview;
    private String bookLiterature;


    public E_Book(String bookTitle, String shortBookDesc, ImageView imageview, String bookLiterature) {
        this.bookTitle = bookTitle;
        this.shortBookDesc = shortBookDesc;
        this.imageview = imageview;
        this.bookLiterature = bookLiterature;
    }

    public E_Book() {
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getShortBookDesc() {
        return shortBookDesc;
    }

    public void setShortBookDesc(String shortBookDesc) {
        this.shortBookDesc = shortBookDesc;
    }

    public ImageView getImageview() {
        return imageview;
    }

    public void setImageview(ImageView imageview) {
        this.imageview = imageview;
    }

    public String getBookLiterature() {
        return bookLiterature;
    }

    public void setBookLiterature(String bookLiterature) {
        this.bookLiterature = bookLiterature;
    }

    @Override
    public String toString() {
        return "E_Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", shortBookDesc='" + shortBookDesc + '\'' +
                ", imageview=" + imageview +
                ", Chapters='" + bookLiterature + '\'' +
                '}';
    }
}
