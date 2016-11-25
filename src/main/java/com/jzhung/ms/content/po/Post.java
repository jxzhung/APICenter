package com.jzhung.ms.content.po;

import java.sql.Timestamp;
import java.util.List;

/**
 * 文章
 * Created by Jzhung on 2016/11/25.
 */
public class Post {
    private Integer postId;
    private String title;
    private String type;
    private String author;
    private Timestamp createtime;
    private Timestamp publishtime;
    private String content;
    private String fromWebsite;
    private String fromUrl;
    private List<Attachment> attachmentList;
    private Category category;

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public Timestamp getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Timestamp publishtime) {
        this.publishtime = publishtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Attachment> getAttachmentList() {
        return attachmentList;
    }

    public void setAttachmentList(List<Attachment> attachmentList) {
        this.attachmentList = attachmentList;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getFromWebsite() {
        return fromWebsite;
    }

    public void setFromWebsite(String fromWebsite) {
        this.fromWebsite = fromWebsite;
    }

    public String getFromUrl() {
        return fromUrl;
    }

    public void setFromUrl(String fromUrl) {
        this.fromUrl = fromUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", author='" + author + '\'' +
                ", createtime=" + createtime +
                ", publishtime=" + publishtime +
                ", content='" + content + '\'' +
                ", fromWebsite='" + fromWebsite + '\'' +
                ", fromUrl='" + fromUrl + '\'' +
                ", attachmentList=" + attachmentList +
                ", category=" + category +
                '}';
    }
}
