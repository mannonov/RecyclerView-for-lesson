package com.jaxadev.recyclerview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerViewAdapter recyclerViewAdapter;

    RecyclerView recyclerView;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item("Acer1", "Acer is best laptop", R.drawable.img_laptop, "https://www.acer.com/ac/en/US/content/home"));
        items.add(new Item("Acer2", "Acer is best laptop", R.drawable.img_laptop, "https://www.acer.com/ac/en/US/content/home"));
        items.add(new Item("Acer3", "Acer is best laptop", R.drawable.img_laptop, "https://www.acer.com/ac/en/US/content/home"));
        items.add(new Item("Acer4", "Acer is best laptop", R.drawable.img_laptop, "https://www.acer.com/ac/en/US/content/home"));
        items.add(new Item("Acer5", "Acer is best laptop", R.drawable.img_laptop, "https://www.acer.com/ac/en/US/content/home"));
        items.add(new Item("Acer6", "Acer is best laptop", R.drawable.img_laptop, "https://www.acer.com/ac/en/US/content/home"));
        items.add(new Item("Acer7", "Acer is best laptop", R.drawable.img_laptop, "https://www.acer.com/ac/en/US/content/home"));
        items.add(new Item("Acer8", "Acer is best laptop", R.drawable.img_laptop, "https://www.acer.com/ac/en/US/content/home"));
        items.add(new Item("Acer9", "Acer is best laptop", R.drawable.img_laptop, "https://www.acer.com/ac/en/US/content/home"));
        items.add(new Item("Acer10", "Acer is best laptop", R.drawable.img_laptop, "https://www.acer.com/ac/en/US/content/home"));
        items.add(new Item("Acer11", "Acer is best laptop", R.drawable.img_laptop, "https://www.acer.com/ac/en/US/content/home"));
        items.add(new Item("Acer12", "Acer is best laptop", R.drawable.img_laptop, "https://www.acer.com/ac/en/US/content/home"));
        items.add(new Item("Acer13", "Acer is best laptop", R.drawable.img_laptop, "https://www.acer.com/ac/en/US/content/home"));

        recyclerViewAdapter = new RecyclerViewAdapter(items, new RecyclerViewAdapter.ItemClickListener() {
            @Override
            public void onClick(Item item) {

                 intent = new Intent(MainActivity.this, SecondActivity.class);

                intent.putExtra(getString(R.string.key), item.url);

                showAlertDialog(item.title);

            }
        });

        recyclerView.setAdapter(recyclerViewAdapter);

    }

    void showToast(String text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
    }

    void showAlertDialog(String text){
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
                .setTitle("Selected Item")
                .setMessage(text)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        startActivity(intent);

                    }
                }).setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).create();

                alertDialog.show();
    }
}