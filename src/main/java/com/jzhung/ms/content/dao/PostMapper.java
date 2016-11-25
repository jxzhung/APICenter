package com.jzhung.ms.content.dao;

import com.jzhung.ms.content.po.Post;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Jzhung on 2016/11/25.
 */
@Repository
public interface PostMapper {
//    @Insert("insert into post(title, content) values(#{title}, #{content})")
    int save(Post post);

//    @Delete("delete from post where postId = #{postId}")
    int deleteById(int id);

//    @Update("update post set title = #{title}, content = #{content} where postId = #{postId}")
    int update(Post post);

//    @Select("select * from post where id = #{id}")
    Post getPostById(int id);

//    @Select("select * from post")
    List<Post> getAllPosts();
}
