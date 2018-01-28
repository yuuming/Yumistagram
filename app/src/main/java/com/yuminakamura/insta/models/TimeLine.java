package com.yuminakamura.insta.models;

/**
 * Created by yuminakamura on 2018-01-26.
 */

public class TimeLine {
    private String username;
    private String profileImage;
    private String image;
    private FeedBack feedBack;
    private String description;

    public TimeLine(String username, String profileImage, String image, FeedBack feedBack, String description) {
        this.username = username;
        this.profileImage = profileImage;
        this.image = image;
        this.feedBack = feedBack;
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public FeedBack getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(FeedBack feedBack) {
        this.feedBack = feedBack;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
