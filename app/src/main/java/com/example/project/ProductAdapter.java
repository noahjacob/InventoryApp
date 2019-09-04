package com.example.project;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter {

    ArrayList<Product> mArrayList;
    Context context;

    public ProductAdapter(Context context, ArrayList<Product> mArrayList) {
        this.mArrayList = mArrayList;
        this.context = context;
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder {
        public TextView mName, mDesc, mQuant;

        public ProductViewHolder(@NonNull LinearLayout itemView) {
            super(itemView);
            mName = (TextView) itemView.findViewById(R.id.productname);
            mDesc = (TextView) itemView.findViewById(R.id.productdesc);
            mQuant = (TextView) itemView.findViewById(R.id.productquant);
        }

        void bind(Product product) {
            mName.setText(product.name);
            mDesc.setText(product.desc);
            mQuant.setText(Integer.toString(product.quant));
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ProductViewHolder(linearLayout);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ProductViewHolder) holder).bind(mArrayList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ProductDetails.class);
                intent.putExtra("position", position);
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }
}
