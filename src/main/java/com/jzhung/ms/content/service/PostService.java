package com.jzhung.ms.content.service;

import com.jzhung.ms.content.po.Post;

/**
 * Created by Jzhung on 2016/11/25.
 */
public interface PostService {
    void savePost(Post post);
    void deletePost(Integer postId);
    void updatePost(Post post);
}
