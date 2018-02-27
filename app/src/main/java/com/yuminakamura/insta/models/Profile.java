package com.yuminakamura.insta.models;

/**
 * Created by yuminakamura on 2018-01-26.
 */

public class Profile {
    private String username;
    private String password;
    private String profileImage;
    private String bio;
    private DataSource dataSource;

    public Profile(String username, String password, String profileImage, String bio, DataSource dataSource) {
        this.username = username;
        this.password = password;
        this.profileImage = profileImage;
        this.bio = bio;
        this.dataSource = dataSource;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
