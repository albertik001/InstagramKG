package com.geektech.instagramkg.data;

public class Model {
    private String text_post;
    private String image_post;

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
