package com.example.project;
import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    public ArrayList arrayList = new ArrayList<Product>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        //Temporary insertion of data
        arrayList.add(new Product("Product one", "let's play Minecraft", 6));
        arrayList.add(new Product("Product returns", "let's play Fortnite", 69));
        arrayList.add(new Product("Product 3", "let's play Pubg", 100));
        arrayList.add(new Product("Product again", "let's play Dota2", 5));
        arrayList.add(new Product("Product 2020", "let's play CS:GO", 7));

        ProductAdapter productAdapter = new ProductAdapter(getApplicationContext(), arrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(productAdapter);
        productAdapter.notifyDataSetChanged();



    }
}
