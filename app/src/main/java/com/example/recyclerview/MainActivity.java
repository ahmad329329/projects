package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.recyclerview.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ItemsAdapter adapter;
    List<Item> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data=getArticlesData();
        adapter=new ItemsAdapter(this,data);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    private List<Item> getArticlesData() {
        List<Item> items=new ArrayList<>();
        Item item=new Item(
                "Java Language",
                "Object oriented language for programmers",
                R.drawable.image1
        );
        items.add(item);
        item =new Item(
                "Html Language",
                "Web language for programmers",
                R.drawable.image2
        );

        items.add(item);
        item =new Item(
                "CSS Language",
                "Web Page designing image for programmers",
                R.drawable.image3
        );

        items.add(item);
        item =new Item(
                "database Language",
                "database for programmers",
                R.drawable.image4
        );

        items.add(item);
        item =new Item(
                "database Language",
                "database for programmers",
                R.drawable.image4
        );

        items.add(item);
        item =new Item(
                "database Language",
                "database for programmers",
                R.drawable.image4
        );

        return items;
    }
}