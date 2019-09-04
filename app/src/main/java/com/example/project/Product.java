package com.example.project;

import android.graphics.Bitmap;

public class Product {
    String name, desc;
    int quant;
    Bitmap photo;

    public Product(String name, String desc, int quant) {
        this.name = name;
        this.desc = desc;
        this.quant = quant;
    }

    public void setPhoto(Bitmap photo) {
        this.photo = photo;
    }

}
