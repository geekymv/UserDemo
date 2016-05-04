package com.geekymv.annotation;

import java.lang.reflect.Field;

public class App {
	
	private String str;
	
	public static void main(String[] args) {
		
		Field[] fields = App.class.getDeclaredFields();
		for(Field f : fields) {
			System.out.println(f.getType());
			System.out.println(f.getClass());
		}
	}

}
