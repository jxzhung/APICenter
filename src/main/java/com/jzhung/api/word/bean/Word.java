package com.jzhung.api.word.bean;

import java.util.List;

/**
 * 单词
 * 
 * @author Jzhung
 * 
 */
public class Word {
	private String word;// 单词
	private String symbol;// 音标
	private String meaning;// 含义
	private List<String> shortSentence;// 短语
	private List<String> egSentence;// 例句

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public List<String> getShortSentence() {
		return shortSentence;
	}

	public void setShortSentence(List<String> shortSentence) {
		this.shortSentence = shortSentence;
	}

	public List<String> getEgSentence() {
		return egSentence;
	}

	public void setEgSentence(List<String> egSentence) {
		this.egSentence = egSentence;
	}

	@Override
	public String toString() {
		return "WordMean [word=" + word + ", symbol=" + symbol + ", meaning="
				+ meaning + ", shortSentence=" + shortSentence
				+ ", egSentence=" + egSentence + "]";
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

}
