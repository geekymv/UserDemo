package com.geekymv.thread;

public class VolatileTest {

	private volatile static int i = 1;
	
	public static void main(String[] args) {
		System.out.println(i);
	}
}
