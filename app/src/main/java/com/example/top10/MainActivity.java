package com.example.top10;

import androidx.appcompat.app.AppCompatActivity;
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
        mList.add(new items(R.drawable.ic_android,"line1","line2"));
        mList.add(new items(R.drawable.ic_android,"line3","line4"));
        mList.add(new items(R.drawable.ic_android,"line5","line6"));



    }
}
