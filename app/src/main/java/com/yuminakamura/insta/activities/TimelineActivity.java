package com.yuminakamura.insta.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.yuminakamura.insta.R;
import com.yuminakamura.insta.models.DataSource;
import com.yuminakamura.insta.models.MyAdapter;
import com.yuminakamura.insta.models.TimeLine;

import java.util.ArrayList;
import java.util.List;

public class TimelineActivity extends AppCompatActivity {

    public ArrayList<TimeLine> timelineLists = DataSource.getTimeLineLists();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.timeline_recycler_view);

        DataSource.createDatas();
        MyAdapter adapter = new MyAdapter(timelineLists);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(adapter);


    }


}
