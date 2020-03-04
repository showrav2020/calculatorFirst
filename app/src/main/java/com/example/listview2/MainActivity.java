package com.example.listview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    List<String> country;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        country= new ArrayList<>();
        country.add("Bangladesh");
        country.add("India");
        country.add("Mayanmar");
        country.add("Pakistan");
        country.add("Argentina");
        country.add("Brazil");
        country.add("Garmany");
        country.add("America");
        country.add("Japan");

        listView=findViewById(R.id.list_view_id);

        CountryAdapter adapter=new CountryAdapter(this,country);
        listView.setAdapter(adapter);
    }
}
