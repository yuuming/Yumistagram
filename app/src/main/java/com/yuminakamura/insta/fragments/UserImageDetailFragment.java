package com.yuminakamura.insta.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.yuminakamura.insta.R;
import com.yuminakamura.insta.models.DataSource;
import com.yuminakamura.insta.models.UserPost;
import com.yuminakamura.insta.models.UserPostAdapter;

import java.util.ArrayList;


public class UserImageDetailFragment extends Fragment {

    UserPost userPost;
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
            Bundle bundle = getArguments();
            userPost = (UserPost)bundle.getSerializable("userpost");
            Log.d("UserImageDetailFragment", userPost.getDescription());

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_user_post_detail, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView user_image = view.findViewById(R.id.user_image);
        TextView user_name = view.findViewById(R.id.user_name);
        ImageView timeline_image = view.findViewById(R.id.timeline_image);
        ImageView favoriteIcon = view.findViewById(R.id.favorite_icon);
        ImageView comment_icon = view.findViewById(R.id.comment_icon);
        TextView num_of_likes = view.findViewById(R.id.num_of_likes);
        TextView likes_text = view.findViewById(R.id.likes_text);
        TextView num_of_comments = view.findViewById(R.id.num_of_comments);
        TextView comments_text = view.findViewById(R.id.comments_text);
        TextView description = view.findViewById(R.id.description);

        user_name.setText(userPost.getUsername());
        num_of_likes.setText(userPost.getFeedBack().getLikes());
        likes_text.setText("Likes: ");
        num_of_comments.setText(userPost.getFeedBack().getComments());
        comments_text.setText("Comments: ");
        description.setText(userPost.getDescription());

        Picasso.with(getContext()).load(userPost.getProfileImage()).into(user_image);
        Picasso.with(getContext()).load(userPost.getImage()).into(timeline_image);


    }
}
