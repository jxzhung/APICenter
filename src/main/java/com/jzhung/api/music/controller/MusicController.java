package com.jzhung.api.music.controller;

import com.jzhung.api.util.JsonData;
import com.jzhung.api.word.service.WordService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Jzhung on 2016/11/24.
 */
@Controller
@RequestMapping("/api/music")
public class MusicController {
    private Logger logger = Logger.getLogger(MusicController.class);
    @Autowired
    WordService wordService;

    @RequestMapping(value = "/album/{b}", method = RequestMethod.GET)
    @ResponseBody
    public JsonData getAllAlbum(@PathVariable("b") String albumId) {
        JsonData jsonData = new JsonData();
        jsonData.setMsg("SUCCESS");
        jsonData.setData("");
        return jsonData;
    }
}
