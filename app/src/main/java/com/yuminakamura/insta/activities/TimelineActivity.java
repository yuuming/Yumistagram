package com.yuminakamura.insta.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.yuminakamura.insta.R;
import com.yuminakamura.insta.models.DataSource;
import com.yuminakamura.insta.models.MyAdapter;
import com.yuminakamura.insta.models.TimeLine;

import java.util.ArrayList;
import java.util.List;

public class TimelineActivity extends AppCompatActivity {

//    public ArrayList<TimeLine> timelineLists = DataSource.createDatas();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
//        MyAdapter adapter = new MyAdapter(timelineLists);
    }

//    private List<TimeLine>
}
