package com.jzhung.api.word.service.impl;

import com.jzhung.api.word.bean.Word;
import com.jzhung.api.word.service.WordService;
import com.jzhung.api.word.util.Const;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/***
 * 有道词库
 */
@Service
public class YouDaoWordProvider implements WordService {
    public static final String URL = "http://www.youdao.com/w/eng/";

    @Override
    public Word searchWord(String word) {
        Word wm = new Word();
        wm.setWord(word);
        Document doc;
        try {
            doc = Jsoup.connect(URL + word).get();

            //含义
            Element em = doc.getElementById("phrsListTab");
            if (em != null) {
                Element masthead = em.select("div.trans-container").first();
                wm.setMeaning(masthead.text());
            }

            //短语
            Element egEm = doc.getElementById("transformToggle");
            if (egEm != null) {
                Element transformToggle = egEm.getElementById("wordGroup");
                if (transformToggle != null) {
                    Elements wg = transformToggle.getElementsByClass("wordGroup");
                    if (wg != null) {
                        List<String> shortSen = new ArrayList<String>();
                        int maxss = Math.min(wg.size(), Const.MAX_SHORT_SENTENCE);//获取不大于最大数量的短语
                        for (int i = 0; i < maxss; i++) {
                            Element e = wg.get(i);
                            shortSen.add(e.text());
                        }
                        wm.setShortSentence(shortSen);
                    }
                }
            }


            //例句
            Element liju = doc.getElementById("bilingual");
            if (liju != null) {
                Elements egs = liju.getElementsByTag("li");
                if (egs != null) {
                    List<String> esList = new ArrayList<String>();
                    int maxes = Math.min(egs.size(), Const.MAX_EXAMPLE_SENTENCE);//获取不大于最大数量的例句
                    for (int i = 0; i < maxes; i++) {
                        Element e = egs.get(i);
                        esList.add(e.text());
                    }
                    wm.setEgSentence(esList);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return wm;
    }
}
