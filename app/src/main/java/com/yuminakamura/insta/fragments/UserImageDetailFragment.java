package com.yuminakamura.insta.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yuminakamura.insta.R;
import com.yuminakamura.insta.models.DataSource;
import com.yuminakamura.insta.models.UserPost;

import java.util.ArrayList;


public class UserImageDetailFragment extends Fragment {


    public ArrayList<UserPost> userPostsLists = DataSource.getUserPostLists();


    public UserImageDetailFragment() {
        // Required empty public constructor
    }

    public static UserImageDetailFragment newInstance() {
        UserImageDetailFragment fragment = new UserImageDetailFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user_post_detail, container, false);
    }

}
