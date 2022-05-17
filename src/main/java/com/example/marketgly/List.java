package com.example.marketgly;

import android.graphics.drawable.Drawable;

public class List {
    private String name;
    private String text;
    private Drawable d;

    public void setD(Drawable d) {
        this.d = d;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Drawable getD() {
        return d;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }
}
