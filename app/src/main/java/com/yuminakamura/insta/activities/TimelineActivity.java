package com.yuminakamura.insta.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.yuminakamura.insta.R;
import com.yuminakamura.insta.models.DataSource;
import com.yuminakamura.insta.models.MyAdapter;
import com.yuminakamura.insta.models.TimeLine;

import java.util.ArrayList;
import java.util.List;

public class TimelineActivity extends AppCompatActivity {

    public ArrayList<TimeLine> timelineLists = DataSource.getTimeLineLists();
    ImageView profileIcon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.timeline_recycler_view);

        DataSource.createDatas();
        MyAdapter adapter = new MyAdapter(timelineLists);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(adapter);

    profileIcon = (ImageView)findViewById(R.id.profileIcon);

    profileIcon.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(TimelineActivity.this,UserActivity.class);
            startActivity(intent);
        }
    });
    }
}
