package com.example.top10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<items> mList = new ArrayList<>();
        mList.add(new items(R.drawable.ic_android,"Name","Cuisine","Locale","Rates"));
        mList.add(new items(R.drawable.ic_android,"Nfame","Cuisfine","Localse","Ratfes"));
        mList.add(new items(R.drawable.ic_android,"Namsse","Cuisisne","Locrale","Ratees"));

        mRecyclerView = findViewById(R.id.rView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new Adapter(mList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);



    }
}
