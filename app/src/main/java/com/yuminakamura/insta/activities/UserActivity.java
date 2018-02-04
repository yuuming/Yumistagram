package com.yuminakamura.insta.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.yuminakamura.insta.R;
import com.yuminakamura.insta.fragments.UserImageDetailFragment;
import com.yuminakamura.insta.fragments.UserImageListFragment;
import com.yuminakamura.insta.models.DataSource;
import com.yuminakamura.insta.models.UserPost;


import java.util.ArrayList;

public class UserActivity extends AppCompatActivity implements UserImageListFragment.userImageSelected {

    public ArrayList<UserPost> userPostsLists = DataSource.getUserPostLists();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragment_container, UserImageListFragment.newInstance(), "userImageList")
                    .commit();
        }

    }

    @Override
    public void userImageSelected() {

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, UserImageDetailFragment.newInstance(), "imageDetail")
                .addToBackStack(null)
                .commit();
    }
}
