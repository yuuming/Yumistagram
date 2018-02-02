package com.yuminakamura.insta.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yuminakamura.insta.R;
import com.yuminakamura.insta.models.FeedBack;
import com.yuminakamura.insta.models.TimeLine;
import com.yuminakamura.insta.models.UserPost;
import com.yuminakamura.insta.models.UserPostAdapter;

import java.util.ArrayList;


public class UserImageListFragment extends Fragment {
    private String username;
    private String profileImage;
    private String image;
    private FeedBack feedBack;
    private String description;

    static ArrayList<UserPost> userPostList = new ArrayList<>();

    public UserImageListFragment() {
        // Required empty public constructor
    }


    public static UserImageListFragment newInstance(String param1, String param2) {
        UserImageListFragment fragment = new UserImageListFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user_post_list, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        recyclerView.setAdapter(new UserPostAdapter(userPostList));
    }
}
