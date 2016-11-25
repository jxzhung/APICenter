package com.jzhung.ms.content.service.impl;

import com.jzhung.ms.content.dao.PostMapper;
import com.jzhung.ms.content.po.Post;
import com.jzhung.ms.content.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Jzhung on 2016/11/25.
 */
@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostMapper postMapper;

    @Override
    public void savePost(Post post) {
        postMapper.save(post);
    }

    @Override
    public void deletePost(Integer postId) {
        postMapper.deleteById(postId);
    }

    @Override
    public void updatePost(Post post) {
        postMapper.update(post);
    }
}
