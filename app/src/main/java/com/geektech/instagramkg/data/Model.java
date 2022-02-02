package com.geektech.instagramkg.data;

public class Model {
    //Посты
    private String text_post;
    private String image_post;
    //Лайки
    private String text_likes;
    private String image_profile;
    private String image_photo_like;
    //
    private String image_tab_layout;

    public Model(String image_tab_layout) {
        this.image_tab_layout = image_tab_layout;
    }

    public String getImage_tab_layout() {
        return image_tab_layout;
    }

    public void setImage_tab_layout(String image_tab_layout) {
        this.image_tab_layout = image_tab_layout;
    }

    public Model(String text_likes, String image_profile, String image_photo_like) {
        this.text_likes = text_likes;
        this.image_profile = image_profile;
        this.image_photo_like = image_photo_like;
    }

    public String getText_likes() {
        return text_likes;
    }

    public void setText_likes(String text_likes) {
        this.text_likes = text_likes;
    }

    public String getImage_profile() {
        return image_profile;
    }

    public void setImage_profile(String image_profile) {
        this.image_profile = image_profile;
    }

    public String getImage_photo_like() {
        return image_photo_like;
    }

    public void setImage_photo_like(String image_photo_like) {
        this.image_photo_like = image_photo_like;
    }

    public String getText_post() {
        return text_post;
    }

    public void setText_post(String text_post) {
        this.text_post = text_post;
    }

    public String getImage_post() {
        return image_post;
    }

    public void setImage_post(String image_post) {
        this.image_post = image_post;
    }

    public Model(String text_post, String image_post) {
        this.text_post = text_post;
        this.image_post = image_post;
    }
}
