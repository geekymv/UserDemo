package com.geekymv.javase;

public class Test {

	public static void main(String[] args) {
		String className = "com.geekymv.javase.A";
		
		try {
			Class<?> clazz = Class.forName(className);
			I i = (I)clazz.newInstance();
			
			System.out.println(i.foo("hello"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
