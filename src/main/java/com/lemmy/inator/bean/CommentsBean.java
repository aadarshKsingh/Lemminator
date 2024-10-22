package com.lemmy.inator.bean;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class CommentsBean {
    private Long commentId;
    private String comment;
    private Long creatorId;
    private Long postId;
    private Date published;
    private CreatorBean creator;
    private CommunityBean community;
    private PostBean post;

    @Autowired
    public CommentsBean(Long commentId, String comment, Long creatorId, Long postId, Date published, CreatorBean creator, CommunityBean community, PostBean post) {
        this.commentId = commentId;
        this.comment = comment;
        this.creatorId = creatorId;
        this.postId = postId;
        this.published = published;
        this.creator = creator;
        this.community = community;
        this.post = post;
    }

    public CommentsBean() {

    }
}
