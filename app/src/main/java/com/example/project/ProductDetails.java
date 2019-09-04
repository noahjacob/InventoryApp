package com.example.project;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ProductDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        int position = getIntent().getIntExtra("position", 0);

        EditText name, description, quant;

        name = findViewById(R.id.productname);
        quant = findViewById(R.id.productquant);
        description = findViewById(R.id.productdesc);

    }

}
