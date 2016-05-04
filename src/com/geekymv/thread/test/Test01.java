package com.geekymv.thread.test;

import org.junit.Test;

import com.geekymv.thread.InsertData;
import com.geekymv.thread.Thread01;

public class Test01 {

	private InsertData id = new InsertData();
	
	@Test
	public void addDataTest() {
		new Thread("线程1") {
			@Override
			public void run() {
				id.insertData(Thread.currentThread());
			};
		}.start();
		
		new Thread("线程2") {
			@Override
			public void run() {
				id.insertData(Thread.currentThread());
			};
		}.start();
		
		
	}
	
	public static void main(String[] args) {
//		ProcessBuilder
//		Runtime
		for(int i = 0; i < 10; i++) {
			Thread01 t = new Thread01();
			t.start();
			System.out.println("----->" + Thread.currentThread().getId());
		}
		
	}
	
}
