package com.jayr.soma.Model;

import android.widget.ImageView;

public class E_Book {
    private String bookTitle;
    private String shortBookDesc;
    private ImageView imageview;
    private String Chapters;


    public E_Book(String bookTitle, String shortBookDesc, ImageView imageview, String chapters) {
        this.bookTitle = bookTitle;
        this.shortBookDesc = shortBookDesc;
        this.imageview = imageview;
        Chapters = chapters;
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

    public String getChapters() {
        return Chapters;
    }

    public void setChapters(String chapters) {
        Chapters = chapters;
    }

    @Override
    public String toString() {
        return "E_Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", shortBookDesc='" + shortBookDesc + '\'' +
                ", imageview=" + imageview +
                ", Chapters='" + Chapters + '\'' +
                '}';
    }
}
