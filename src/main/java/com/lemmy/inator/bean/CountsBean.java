package com.lemmy.inator.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"published","newest_comment_time"})
public class CountsBean {
    private int post_id;
    private int comments;
    private int score;
    private int upvotes;
    private int downvotes;

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    public int getDownvotes() {
        return downvotes;
    }

    public void setDownvotes(int downvotes) {
        this.downvotes = downvotes;
    }

    @Override
    public String toString() {
        return "CountsBean{" +
                "post_id=" + post_id +
                ", comments=" + comments +
                ", score=" + score +
                ", upvotes=" + upvotes +
                ", downvotes=" + downvotes +
                '}';
    }
}
