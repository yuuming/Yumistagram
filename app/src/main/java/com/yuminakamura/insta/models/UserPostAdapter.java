package com.yuminakamura.insta.models;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yuminakamura.insta.R;

import java.util.List;

/**
 * Created by yuminakamura on 2018-01-24.
 */
public class UserPostAdapter extends RecyclerView.Adapter<UserPostAdapter.MyViewHolder>{

    private List<UserPost> userPosts;
    public Context mContext;

    public UserPostAdapter(List<UserPost> userPosts) {
        this.userPosts = userPosts;
    }

    public void setUserPosts(List<UserPost> userPosts) {
        this.userPosts = userPosts;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(View itemView) {
            super(itemView);
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
    }

    @Override
    public int getItemCount() {
        return userPosts.size();
    }
}
