package com.example.marketgly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

public class SubActivity extends AppCompatActivity {

    private ImageButton btn_move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        btn_move = findViewById(R.id.move);

        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubActivity.this, MainActivity.class);
                startActivity(intent); // intent move
                overridePendingTransition(0, 0);
            }
        });



        ListView list1 = findViewById(R.id.List1);
        Listitems listadapter = new Listitems();

        list1.setAdapter(listadapter);

        listadapter.addItems(ContextCompat.getDrawable(this, R.drawable.ic_baseline_image_24), "Title2", "sub_info");
        listadapter.addItems(ContextCompat.getDrawable(this, R.drawable.ic_baseline_image_24), "Title2", "sub_info");
        listadapter.addItems(ContextCompat.getDrawable(this, R.drawable.ic_baseline_image_24), "Title2", "sub_info");
        listadapter.addItems(ContextCompat.getDrawable(this, R.drawable.ic_baseline_image_24), "Title2", "sub_info");
        listadapter.addItems(ContextCompat.getDrawable(this, R.drawable.ic_baseline_image_24), "Title2", "sub_info");
        listadapter.addItems(ContextCompat.getDrawable(this, R.drawable.ic_baseline_image_24), "Title2", "sub_info");
    }
}