package com.example.a21_11_2022_recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView productsRecyclerView;
    private ProductsAdapter productsAdapter;
    private ArrayList<String> products;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initProducts();
        initViews();
    }

    private void initViews(){
        productsRecyclerView = findViewById(R.id.productsRecyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                true
        );
        productsRecyclerView.setLayoutManager(linearLayoutManager);
        productsAdapter = new ProductsAdapter(products);
        productsRecyclerView.setAdapter(productsAdapter);
    }

    private void initProducts(){
        products = new ArrayList<String>();
        for(int i = 0;i<5;i++){
            products.add("T-Shirt"+i);
            products.add("Laptop"+i);
            products.add("Charger"+i);
            products.add("Cup"+i);
        }
    }
}