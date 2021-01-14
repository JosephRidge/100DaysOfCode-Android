package com.jayr.day8;

import android.widget.ImageView;

public class Contact {
    private String name;
    private String email;
    private ImageView imageView;

    public Contact(String name, String email, ImageView imageView) {
        this.name = name;
        this.email = email;
        this.imageView = imageView;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", imageView=" + imageView +
                '}';
    }
}
