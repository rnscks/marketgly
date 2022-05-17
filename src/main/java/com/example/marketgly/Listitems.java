package com.example.marketgly;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Listitems extends BaseAdapter {
    ArrayList<List> items = new ArrayList<>();


    // count num
    @Override
    public int getCount() {
        return items.size();
    }


    // road data
    @Override
    public Object getItem(int i) {
        return items.get(i);
    }


    // location data
    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Context c = viewGroup.getContext();

        if (view == null){
            LayoutInflater li = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = li.inflate(R.layout.list_main,viewGroup, false);
        }


        TextView title = view.findViewById(R.id.title);
        TextView subTitle = view.findViewById(R.id.subTitle);
        ImageView face = view.findViewById(R.id.face);

        List f = items.get(i);

        title.setText(f.getName());
        subTitle.setText(f.getText());
        face.setImageDrawable(f.getD());

        return view;
    }
    public void addItems(Drawable d, String text, String name){
        List f = new List();

        f.setD(d);
        f.setName(name);
        f.setText(text);

        items.add(f);
    }
}
