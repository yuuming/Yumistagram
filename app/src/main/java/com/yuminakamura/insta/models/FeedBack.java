package com.yuminakamura.insta.models;

/**
 * Created by yuminakamura on 2018-01-26.
 */

public class FeedBack {
    private String likes;
    private String comments;

    public FeedBack(String likes, String comments) {
        this.likes = likes;
        this.comments = comments;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes() {
        this.likes = likes;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
