package com.geekymv.javase.thread;

public class MyThread extends Thread {
	
	@Override
	public synchronized void run() {
		System.out.println(Thread.currentThread().getName() + " --> hello world");
		try {
			Thread.sleep(5 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// 一个对象一把锁
		MyThread mt = new MyThread();
		// 多个线程共享一个对象
		Thread t1 = new Thread(mt, "t1");
		Thread t2 = new Thread(mt, "t2");
		Thread t3 = new Thread(mt, "t3");
		Thread t4 = new Thread(mt, "t4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	
}
