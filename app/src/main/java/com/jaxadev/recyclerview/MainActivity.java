package com.jaxadev.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerViewAdapter recyclerViewAdapter;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item("Acer" , "Acer is best laptop",R.drawable.img_laptop));
        items.add(new Item("Acer" , "Acer is best laptop",R.drawable.img_laptop));
        items.add(new Item("Acer" , "Acer is best laptop",R.drawable.img_laptop));
        items.add(new Item("Acer" , "Acer is best laptop",R.drawable.img_laptop));
        items.add(new Item("Acer" , "Acer is best laptop",R.drawable.img_laptop));
        items.add(new Item("Acer" , "Acer is best laptop",R.drawable.img_laptop));
        items.add(new Item("Acer" , "Acer is best laptop",R.drawable.img_laptop));
        items.add(new Item("Acer" , "Acer is best laptop",R.drawable.img_laptop));
        items.add(new Item("Acer" , "Acer is best laptop",R.drawable.img_laptop));
        items.add(new Item("Acer" , "Acer is best laptop",R.drawable.img_laptop));
        items.add(new Item("Acer" , "Acer is best laptop",R.drawable.img_laptop));
        items.add(new Item("Acer" , "Acer is best laptop",R.drawable.img_laptop));
        items.add(new Item("Acer" , "Acer is best laptop",R.drawable.img_laptop));

        recyclerViewAdapter = new RecyclerViewAdapter(items);

        recyclerView.setAdapter(recyclerViewAdapter);

    }
}