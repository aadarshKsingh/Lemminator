package com.lemmy.inator.config;

import com.lemmy.inator.bean.*;
import com.lemmy.inator.service.ServiceImpl;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<PostBean> postBeans() {
        // Initialize the list with some default values if needed
        return new ArrayList<>();
    }

    @Bean
    public CreatorBean getCreatorBean(){
        return new CreatorBean();
    }

    @Bean
    public CommunityBean getCommunityBean(){
        return new CommunityBean();
    }

    @Bean
    public CommentsBean getCommentsBean(){
        return new CommentsBean();
    }

    @Bean
    public PostBean getPostBean(){
        return new PostBean();
    }

//    @Bean
//    public PostResponse getPostsBean(){
//        return new PostResponse();
//    }
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate(); // This creates a RestTemplate bean
    }
}