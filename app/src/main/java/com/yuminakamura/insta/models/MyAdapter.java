package com.yuminakamura.insta.models;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.yuminakamura.insta.R;

import java.util.List;

/**
 * Created by yuminakamura on 2018-01-24.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    private List<TimeLine> timeLinelists;
    public Context mContext;

    public MyAdapter(List<TimeLine> timeLinelists) {
        this.timeLinelists = timeLinelists;
    }

    public void setTimeLinelists(List<TimeLine> timeLinelists) {
        this.timeLinelists = timeLinelists;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView username, numLikes, textLikes, numComments, textComments, description;
        public ImageView userImage, timelineImage,favoriteImage, commentImage;

        public MyViewHolder(View itemView) {
            super(itemView);

            username = (TextView) itemView.findViewById(R.id.user_name);
            numLikes = (TextView) itemView.findViewById(R.id.num_of_likes);
            textLikes = (TextView) itemView.findViewById(R.id.likes_text);
            numComments = (TextView) itemView.findViewById(R.id.num_of_comments);
            textComments = (TextView) itemView.findViewById(R.id.comments_text);
            userImage = (ImageView) itemView.findViewById(R.id.user_image);
            timelineImage = (ImageView) itemView.findViewById(R.id.timeline_image);
            favoriteImage = (ImageView) itemView.findViewById(R.id.favorite_icon);
            commentImage = (ImageView) itemView.findViewById(R.id.comment_icon);
            description = (TextView)itemView.findViewById(R.id.description);


        }
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.timeline_item, parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(inflate);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyAdapter.MyViewHolder holder, int position) {
        holder.username.setText(timeLinelists.get(position).getUsername());
        holder.numLikes.setText(timeLinelists.get(position).getFeedBack().getLikes());
        holder.textLikes.setText("Likes");
        holder.numComments.setText(timeLinelists.get(position).getFeedBack().getComments());
        holder.textComments.setText("Comments");
        holder.description.setText(timeLinelists.get(position).getDescription());


        Picasso.with(holder.timelineImage.getContext()).load(timeLinelists.get(position).getImage()).into(holder.timelineImage);
        Picasso.with(holder.userImage.getContext()).load(timeLinelists.get(position).getProfileImage()).into(holder.userImage);


    }

    @Override
    public int getItemCount() {
        return timeLinelists.size();
    }
}
