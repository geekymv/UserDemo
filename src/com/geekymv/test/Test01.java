package com.geekymv.test;

import java.util.Arrays;
import java.util.List;

public class Test01 {
	
	public <T> T hello(String t){
		return (T)t ;
	}
	
	public static String[] strs = {"拾", "佰", "仟", "萬", "拾萬", "拾萬", "佰萬", "仟萬"};

	// 1000
	
	
	
	public static void main(String[] args) {
		Test01 test = new Test01();
		
		System.out.println(test.hello("1"));
		
		/*
		Test01 test = new Test01();
		String str = "123";
		
		// 判断位数
		if(str == null || str.length() != 8 ) {
			System.out.println("不是8位！！！");
			return;
		}
		// 判断是否为数字
		boolean isDigit = test.isDigit(str);
		
		if(isDigit) {	// 是数字
			
			for(int i = 0, len = str.length(); i < len; i++) {
				char num = str.charAt(i);
				String val = String.valueOf(num);
				String res = test.convertUpperCase(val);
				System.out.print(res);
			}	
			
		}else {
			System.out.println("用户输人的字符不都为数字，无法转换！！！");
		}
		*/
//		System.out.println("个位 = " + 10120452 % 10);
//		System.out.println("十位 = " + (10120452 / 10) % 10);
//		System.out.println("百位 = " + (10120452 / 100) % 10);
//		System.out.println("千位 = " + (10120452 / 1000) % 10);
//		System.out.println("万位 = " + (10120452 / 10000) % 10);
//		System.out.println("十万位 = " + (10120452 / 100000) % 10);
//		System.out.println("百万位 = " + (10120452 / 1000000) % 10);
//		System.out.println("千万位 = " + (10120452 / 10000000) % 10);
//		int val = 10120452;
//		String v = val+"";
//		
//		int div = 1;
//		for(int i = 0, len = v.length(); i < len; i++) {
//			
//		}
	}
	
	/**
	 * 判断一个字符串是否为数字
	 * 思路：
	 * 1.判断参数是否为空
	 * 2.遍历字符串 只要有一个不是数字，那么整个字符串就不是数字
	 * 
	 * @author: miying
	 * @createTime: 2015年9月18日 下午1:33:21
	 * @history:
	 * @param str
	 * @return boolean true是数字，false不是数字
	 */
	public boolean isDigit(String str) {
		if(str == null || str.length() == 0 ) {
			return false;
		}
		
		for(int i = 0, len = str.length(); i < len; i++) {
			char num = str.charAt(i);
			if(num < '0' || num > '9') {	// 只要有一个不是数字，那么整个字符串就不是数字
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * 将数字转换成大写
	 * 1--> 一
	 * 2--> 二
	 * ...
	 * 
	 * @author: miying
	 * @createTime: 2015年9月18日 下午1:43:51
	 * @history:
	 * @param str
	 * @return String
	 */
	public String convertUpperCase(String str) {
		Integer val = Integer.parseInt(str);

		List<String> uppers = Arrays.asList("零", "一", "二", "三", "四", "五", "六", "七", "八", "九");
		
		for(int i = 0, len = uppers.size(); i < len; i++) {
			if(val == i) {
				return uppers.get(i);
			}
		}
		
		return null;
	}
	
 
}
