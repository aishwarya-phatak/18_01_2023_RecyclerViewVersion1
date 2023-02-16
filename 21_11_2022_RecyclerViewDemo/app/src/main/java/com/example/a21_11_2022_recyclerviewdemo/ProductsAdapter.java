package com.example.a21_11_2022_recyclerviewdemo;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductViewHolder> {
    private ArrayList<String> products;
    public ProductsAdapter(ArrayList<String> products){
            this.products = products;
    }

    class ProductViewHolder extends RecyclerView.ViewHolder{
        TextView txtProduct;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            txtProduct = (TextView) itemView;
        }
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TextView txtProductView = new TextView(parent.getContext());
        ViewGroup.LayoutParams layoutParamsForTextView = new
                ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        txtProductView.setLayoutParams(layoutParamsForTextView);
        txtProductView.setPadding(20,20,20,20);
        txtProductView.setTextSize(24.0F);
        return new ProductViewHolder(txtProductView);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
            holder.txtProduct.setText(products.get(position));
    }

    @Override
    public int getItemCount() {
        return products.size();
    }
}
