package com.jzhung.api.word.service.impl;

import com.jzhung.api.word.bean.Word;
import com.jzhung.api.word.service.WordService;
import com.jzhung.api.word.util.Const;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

/**
 * 海词词库
 */

public class HaiCiWordProvider implements WordService {
    public static final String URL = "http://dict.cn/";

    @Override
    public Word searchWord(String word) {
        Word wm = new Word();
        wm.setWord(word);
        Document doc;
        try {
            doc = Jsoup.connect(URL + word).get();
            // 含义
            Element em = doc.getElementById("sctlist");
            if (em != null) {
                Element masthead = em.select("div.mboxcc").get(1);
                if (masthead != null) {
                    wm.setMeaning(masthead.text());
                }
            }

            // 短语
            Elements egEm = doc.getElementsByClass("mboxcc");
            if (egEm != null) {
                Elements wg = egEm.get(7).getElementsByTag("li");
                if (wg != null) {
                    List<String> shortSen = new ArrayList<String>();
                    int maxss = Math.min(wg.size(), Const.MAX_SHORT_SENTENCE);// 获取不大于最大数量的短语
                    for (int i = 0; i < maxss; i++) {
                        Element e = wg.get(i);
                        if (e != null) {
                            shortSen.add(e.text());
                        }
                    }
                    wm.setShortSentence(shortSen);
                }
            }

            // 例句
            Elements liju = doc.getElementsByClass("mboxcc");
            if (liju != null) {
                Elements egs = liju.get(3).getElementsByTag("li");
                if (egs != null) {
                    List<String> esList = new ArrayList<String>();
                    int maxes = Math
                            .min(egs.size(), Const.MAX_EXAMPLE_SENTENCE);// 获取不大于最大数量的例句
                    for (int i = 0; i < maxes; i++) {
                        Element e = egs.get(i);
                        if (e != null) {
                            esList.add(e.text());
                        }
                    }
                    wm.setEgSentence(esList);
                }
            }

        } catch (Exception e) {
            wm.setMeaning("请输入正确单词");
        }
        return wm;
    }
}
