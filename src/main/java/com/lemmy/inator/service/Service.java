package com.lemmy.inator.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.lemmy.inator.bean.PostBean;
import com.lemmy.inator.bean.PostItem;

import java.util.List;
@org.springframework.stereotype.Service
public interface Service {
    public void service() throws JsonProcessingException;
    public List<PostItem> getPosts();
    public String parseMarkdown(String plainText);
}
