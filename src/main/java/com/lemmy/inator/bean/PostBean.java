package com.lemmy.inator.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
@JsonIgnoreProperties({"updated","creator_id","community_id","removed","locked","deleted","ap_id","local","language_id","featured_community","featured_local"})
public class PostBean {
    @JsonProperty("id")
    private int id;
    private String name;
    private String url;
    private String body;
    private Date published;
    private String embed_title;
    private String embed_description;
    private String thumbnail_url;
    private boolean nsfw;
    private CreatorBean creator;
    private CommunityBean community;

    public PostBean() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public String getEmbed_title() {
        return embed_title;
    }

    public void setEmbed_title(String embed_title) {
        this.embed_title = embed_title;
    }

    public String getEmbed_description() {
        return embed_description;
    }

    public void setEmbed_description(String embed_description) {
        this.embed_description = embed_description;
    }

    public String getThumbnail_url() {
        return thumbnail_url;
    }

    public void setThumbnail_url(String thumbnail_url) {
        this.thumbnail_url = thumbnail_url;
    }

    public boolean isNsfw() {
        return nsfw;
    }

    public void setNsfw(boolean nsfw) {
        this.nsfw = nsfw;
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
}
