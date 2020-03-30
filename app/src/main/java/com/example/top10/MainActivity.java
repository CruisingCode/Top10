package com.example.top10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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
        mList.add(new items(R.drawable.baz,"Barzaari","Middle Eastern","Marrickville","7/10"));
        mList.add(new items(R.drawable.ciao,"Ciao Down","Italian","Lindfield","7.5/10"));
        mList.add(new items(R.drawable.korean,"Gogiya & Suliya Korean BBQ","Korean","Lidcombe","7.5/10"));
        mList.add(new items(R.drawable.thai,"Thai Tucka Restaurant","Thai","Gordon","8/10"));
        mList.add(new items(R.drawable.chicken,"Chicken Licious","Lebanese","Rockdale","7/10"));
        mList.add(new items(R.drawable.dol,"The Dolphin Hotel","Australian","Surry Hills","8/10"));
        mList.add(new items(R.drawable.beach,"Beach Burrito Company","Mexican","Bondi Junction","8/10"));
        mList.add(new items(R.drawable.tokoyo,"Tokyo Syokudo","Japanese","Croydon","7.5/10"));
        mList.add(new items(R.drawable.woods,"The Woods Cafe & Deli","Café","Earlwood","7/10"));
        mList.add(new items(R.drawable.hurst,"Hurstville Chinese Restaurant","Chinese","Hurstville","7/10"));

        mRecyclerView = findViewById(R.id.rView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new Adapter(mList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);


    }
}
