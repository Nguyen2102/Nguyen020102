package com.example.customizespinnerandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentProviderOperation;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerCategory;
    private CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerCategory = findViewById(R.id.spinner_Category);
        categoryAdapter = new CategoryAdapter(this, R.layout.item_selected, getListCategory());
        spinnerCategory.setAdapter(categoryAdapter);
        spinnerCategory.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, categoryAdapter.getItem((int) id).getName(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private List<Category> getListCategory() {
        List<Category> list = new ArrayList<>();
        list.add(new Category("Nguyên1"));
        list.add(new Category("Nguyên2"));
        list.add(new Category("Nguyên3"));
        list.add(new Category("Nguyên4"));
        list.add(new Category("Nguyên5"));

        return list;
    }
}