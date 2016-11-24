package com.jzhung.api.music.bean;

import java.util.List;

/**
 * 专辑
 */
public class Album {
    private String author;
    private String desc;
    private List<Music> musicList;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
}
