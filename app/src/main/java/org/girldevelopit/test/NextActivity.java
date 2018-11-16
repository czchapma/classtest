package org.girldevelopit.test;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        ListView listView = findViewById(R.id.mylist);
        List<String> items = Arrays.asList("Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread", "Honeycomb");
        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this, R.layout.simple_list_item, items);
        listView.setAdapter(arrayAdapter);
    }

}
