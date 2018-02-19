package com.yuminakamura.insta.models;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.yuminakamura.insta.R;
import com.yuminakamura.insta.fragments.UserImageListFragment;

import java.util.List;

/**
 * Created by yuminakamura on 2018-01-24.
 */
public class UserPostAdapter extends RecyclerView.Adapter<UserPostAdapter.MyViewHolder> {

    private static final String TAG = UserPostAdapter.class.getSimpleName();
    private List<UserPost> userPostlists;
    public Context mContext;

    public UserPostAdapter(List<UserPost> userPosts) {
        this.userPostlists = userPosts;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView postImage;

        public MyViewHolder(View itemView) {
            super(itemView);

            postImage = (ImageView) itemView.findViewById(R.id.post_image);
        }
    }


    @Override
    public UserPostAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user_post, parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(inflate);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(UserPostAdapter.MyViewHolder holder, int position) {
        Picasso.with(holder.postImage.getContext()).load(userPostlists.get(position).getImage()).into(holder.postImage);

    }

    @Override
    public int getItemCount() {
        return userPostlists.size();
    }
}
