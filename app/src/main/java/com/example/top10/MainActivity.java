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
        mList.add(new items(R.drawable.ic_android,"Barzaari","Middle Eastern","Marrickville","7/10"));
        mList.add(new items(R.drawable.ic_android,"Ciao Down","Italian","Lindfield","7.5/10"));
        mList.add(new items(R.drawable.ic_android,"Gogiya & Suliya Korean BBQ","Korean","Lidcombe","7.5/10"));
        mList.add(new items(R.drawable.ic_android,"Thai Tucka Restaurant","Thai","Gordon","8/10"));
        mList.add(new items(R.drawable.ic_android,"Chicken Licious","Lebanese","Rockdale","7/10"));
        mList.add(new items(R.drawable.ic_android,"The Dolphin Hotel","Australian","Surry Hills","8/10"));
        mList.add(new items(R.drawable.ic_android,"Beach Burrito Company","Mexican","Bondi Junction","8/10"));
        mList.add(new items(R.drawable.ic_android,"Tokyo Syokudo","Japanese","Croydon","7.5/10"));
        mList.add(new items(R.drawable.ic_android,"The Woods Cafe & Deli","Café","Earlwood","7/10"));
        mList.add(new items(R.drawable.ic_android,"Hurstville Chinese Restaurant","Chinese","Hurstville","7/10"));

        mRecyclerView = findViewById(R.id.rView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new Adapter(mList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);



    }
}
