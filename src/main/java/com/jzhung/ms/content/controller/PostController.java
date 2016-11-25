package com.jzhung.ms.content.controller;

import com.jzhung.ms.content.po.Post;
import com.jzhung.ms.content.service.PostService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Jzhung on 2016/11/25.
 */
@Controller
@RequestMapping("/post")
public class PostController {
    private Logger logger = Logger.getLogger(PostController.class);
    @Autowired
    private PostService postService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String translate(Post post) {
        logger.info("/post/add" + post.toString());
        postService.savePost(post);
        return "word";
    }
}
