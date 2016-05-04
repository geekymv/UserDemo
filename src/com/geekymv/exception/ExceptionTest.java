package com.geekymv.exception;


public class ExceptionTest {
	
	public static void main(String[] args) {
		try {
			int i = 1 / 0;
		} catch (Exception e) {
//			e.printStackTrace();
			throw new RuntimeException();
		}
		// hello world会执行么
		System.out.println("hello world");
	}

}
