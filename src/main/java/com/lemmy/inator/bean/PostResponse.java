package com.lemmy.inator.bean;

import java.util.List;

public class PostResponse {
    private List<PostItem> posts;
    private String next_page;

    public String getNext_page() {
        return next_page;
    }

    public void setNext_page(String next_page) {
        this.next_page = next_page;
    }

    public List<PostItem> getPosts() {
        return posts;
    }

    public void setPosts(List<PostItem> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "PostResponse{" +
                "posts=" + posts +
                '}';
    }
}