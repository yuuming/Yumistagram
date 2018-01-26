package com.yuminakamura.insta.models;

/**
 * Created by yuminakamura on 2018-01-26.
 */

public class FeedBack {
    private int likes;
    private int comments;

    public FeedBack(int likes, int comments) {
        this.likes = likes;
        this.comments = comments;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }
}
