package com.geekymv.thread;

public class Thread01 extends Thread {
	
	@Override
	public void run() {
		System.out.println("主线程id = " + this.getId() + ", hello world");
	}
}
