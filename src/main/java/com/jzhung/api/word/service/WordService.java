package com.jzhung.api.word.service;

import com.jzhung.api.word.bean.Word;

/**
 * 单词业务逻辑
 */
public interface WordService {
    /**
     * 查询单词含义
     * @param word 要查询的单词
     * @return
     */
    Word searchWord(String word);
}
