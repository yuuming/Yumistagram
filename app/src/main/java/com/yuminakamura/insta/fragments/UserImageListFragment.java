package com.yuminakamura.insta.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yuminakamura.insta.R;
import com.yuminakamura.insta.models.DataSource;
import com.yuminakamura.insta.models.FeedBack;
import com.yuminakamura.insta.models.RecyclerTouchListener;
import com.yuminakamura.insta.models.UserPost;
import com.yuminakamura.insta.models.UserPostAdapter;

import java.util.ArrayList;


public class UserImageListFragment extends Fragment {
    private String username;
    private String profileImage;
    private String image;
    private FeedBack feedBack;
    private String description;

    public ArrayList<UserPost> userPostsLists = DataSource.getUserPostLists();

    public UserImageListFragment() {
        // Required empty public constructor
    }

    public static UserImageListFragment newInstance() {
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
        View rootView = inflater.inflate(R.layout.fragment_user_post_list, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.profile_recycler_view);
        DataSource.createUserPostDatas();
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        recyclerView.setAdapter(new UserPostAdapter(userPostsLists));

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                UserPost userPost = userPostsLists.get(position);
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                UserImageDetailFragment fragment = new UserImageDetailFragment();
                transaction.replace(R.id.fragment_container, fragment);
                transaction.addToBackStack(null);//前のfragmentへもどるのに必要
                transaction.commit();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }


    public interface userImageSelected {
        void userImageSelected();
        //step 2
    }


}
