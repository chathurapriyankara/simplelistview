package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final List<String> pizzaDetails = new ArrayList<>();
        pizzaDetails.add("One");
        pizzaDetails.add("Two");
        pizzaDetails.add("Three");
        pizzaDetails.add("Four");
        pizzaDetails.add("Five");
        ListView pizzaDetailsList = findViewById(R.id.pizzaDetails);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> pizzaDetailsList, View view, int position, long id) {
                Toast toast = Toast.makeText(getApplicationContext(),pizzaDetails.get(position),Toast.LENGTH_LONG);
                toast.show();
            }
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.list_item,R.id.textView,pizzaDetails);
        pizzaDetailsList.setAdapter(adapter);
        pizzaDetailsList.setOnItemClickListener(itemClickListener);
    }

}
