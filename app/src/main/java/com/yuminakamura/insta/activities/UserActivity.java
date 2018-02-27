package com.yuminakamura.insta.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.yuminakamura.insta.R;
import com.yuminakamura.insta.fragments.UserImageDetailFragment;
import com.yuminakamura.insta.fragments.UserImageListFragment;
import com.yuminakamura.insta.models.DataSource;
import com.yuminakamura.insta.models.UserPost;

import java.util.ArrayList;

/**
 * TODO tab idou
 * friends gamen
 * account gamen
 * kamera kidou
 * login wo firebase
 */
public class UserActivity extends AppCompatActivity implements UserImageListFragment.userImageSelected{

    private TextView mTextMessage;

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


//        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }

    @Override
    public void userImageSelected() {

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, UserImageDetailFragment.newInstance(), "imageDetail")
                .addToBackStack(null)
                .commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    return true;
                case R.id.navigation_friends:
//                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.profileIcon:
//                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

}
