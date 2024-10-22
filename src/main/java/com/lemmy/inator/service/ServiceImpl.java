package com.lemmy.inator.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.lemmy.inator.bean.PostItem;
import com.lemmy.inator.bean.PostResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{
    @Autowired
    private RestTemplate restTemplate;

    private PostResponse postResponse;

    @Autowired
    public ServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public void service() throws JsonProcessingException {
        String url = "https://thelemmy.club/api/v3/post/list";
        postResponse = restTemplate.getForObject(url, PostResponse.class);
    }

    @Override
    public List<PostItem> getPosts() {
        return postResponse.getPosts();
    }

    @Override
    public String parseMarkdown(String plainText) {
        Parser parser = Parser.builder().build();
        HtmlRenderer htmlRenderer = HtmlRenderer.builder().build();
        String parsed = htmlRenderer.render(parser.parse(plainText));
        return parsed;
    }
}
