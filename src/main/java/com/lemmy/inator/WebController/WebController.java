package com.lemmy.inator.WebController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.lemmy.inator.bean.PostBean;
import com.lemmy.inator.bean.PostItem;
import com.lemmy.inator.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class WebController {
    @Autowired
    private final ServiceImpl service;

    public WebController(ServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/feed")
    public ModelAndView getFeed() throws JsonProcessingException {
        service.service();
        ModelAndView mav = new ModelAndView();
        List<PostItem> posts = service.getPosts();
        for(PostItem item : posts){
            if(item.getPost().getBody()!=null){
                item.getPost().setBody(service.parseMarkdown(item.getPost().getBody()));
            }
        }
        mav.setViewName("feed");
        mav.addObject("posts",posts);
        return mav;
    }
}
