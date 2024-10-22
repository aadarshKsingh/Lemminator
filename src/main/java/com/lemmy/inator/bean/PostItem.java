package com.lemmy.inator.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"creator_banned_from_community", "creator_is_moderator", "creator_is_admin", "post_id", "comments", "score", "upvotes", "downvotes", "published", "newest_comment_time", "subscribed", "saved", "read", "creator_blocked", "unread_comments"})
public class PostItem {
    private PostBean post;
    private CreatorBean creator;
    private CommunityBean community;
    private CountsBean counts;
    // Getters and Setters

    public PostBean getPost() {
        return post;
    }

    public void setPost(PostBean post) {
        this.post = post;
    }

    public CreatorBean getCreator() {
        return creator;
    }

    public void setCreator(CreatorBean creator) {
        this.creator = creator;
    }

    public CommunityBean getCommunity() {
        return community;
    }

    public void setCommunity(CommunityBean community) {
        this.community = community;
    }

    public CountsBean getCounts() {
        return counts;
    }

    public void setCounts(CountsBean counts) {
        this.counts = counts;
    }

}