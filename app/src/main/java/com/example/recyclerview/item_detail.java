package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;

public class item_detail extends AppCompatActivity {
    TextView title;
    TextView description;

    ImageView image;
    Item article;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        title=findViewById(R.id.title);
        description=findViewById(R.id.description);
        image=findViewById(R.id.image);

        article=new Gson().fromJson(getIntent().getStringExtra("data"), Item.class);

        title.setText(article.getTitle());
        description.setText(article.getDescription());
        image.setImageResource(article.getImage());
    }
}