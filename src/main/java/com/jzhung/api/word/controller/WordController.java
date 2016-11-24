package com.jzhung.api.word.controller;

import com.jzhung.api.util.JsonData;
import com.jzhung.api.word.bean.Word;
import com.jzhung.api.word.service.WordService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 单词翻译API
 */
@Controller
@RequestMapping("/api/word")
public class WordController {
    private Logger logger = Logger.getLogger(WordController.class);
    @Autowired
    WordService wordService;

    @RequestMapping(value="/{word}",method=RequestMethod.GET)
    @ResponseBody
    public JsonData translate(@PathVariable("word") String word){
        Word wm = wordService.searchWord(word);
        JsonData jsonData = new JsonData();
        jsonData.setMsg("SUCCESS");
        jsonData.setData(wm);
        logger.info("word:" + wm);
        return jsonData;
    }
}
