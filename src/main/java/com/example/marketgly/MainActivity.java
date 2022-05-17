package com.example.marketgly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    public ImageButton btn_move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_move = findViewById(R.id.move);

        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);

                startActivity(intent); // intent move
                overridePendingTransition(0, 0);
            }
        });

        ListView list1 = findViewById(R.id.List1);
        Listitems listadapter = new Listitems();

        list1.setAdapter(listadapter);

        listadapter.addItems(ContextCompat.getDrawable(this, R.drawable.ic_launcher_foreground), "Title", "sub_info");
        listadapter.addItems(ContextCompat.getDrawable(this, R.drawable.ic_launcher_foreground), "Title", "sub_info");
        listadapter.addItems(ContextCompat.getDrawable(this, R.drawable.ic_launcher_foreground), "Title", "sub_info");
        listadapter.addItems(ContextCompat.getDrawable(this, R.drawable.ic_launcher_foreground), "Title", "sub_info");
        listadapter.addItems(ContextCompat.getDrawable(this, R.drawable.ic_launcher_foreground), "Title", "sub_info");
        listadapter.addItems(ContextCompat.getDrawable(this, R.drawable.ic_launcher_foreground), "Title", "sub_info");
        listadapter.addItems(ContextCompat.getDrawable(this, R.drawable.ic_launcher_foreground), "Title", "sub_info");
        listadapter.addItems(ContextCompat.getDrawable(this, R.drawable.ic_launcher_foreground), "Title", "sub_info");

    }
}