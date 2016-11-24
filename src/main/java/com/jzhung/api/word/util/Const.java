package com.jzhung.api.word.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 常量及工具类
 * 
 * @author Jzhung
 * 
 */
public class Const {
	public static final int MAX_SHORT_SENTENCE = 5;// 最大短语数
	public static final int MAX_EXAMPLE_SENTENCE = 5;// 最大例句数
	
	public static Properties prop;
	public static String classRoot;

	public static Properties load(String classRoot) {
		Properties prop = new Properties();
		File resFile = new File(classRoot + "/c3p0.properties");
		if(!resFile.exists()){
			System.out.println("配置文件不存在");
			return null;
		}
		try {
			InputStream in = new FileInputStream(resFile);
			prop.load(in);
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop;
	}

	public static String getValue(String key) {
		if (prop == null)
			prop = load(classRoot);
		return prop.getProperty(key);
	}
}
