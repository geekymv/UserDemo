package com.geekymv.thread;

import java.util.ArrayList;
import java.util.List;

public class InsertData {
	
	private List<String> datas = new ArrayList<String>();

	public synchronized void insertData(Thread t) {
		for (int i = 0; i < 20; i++) {
//			System.out.println(t.getName() + " -- > " + i);
			datas.add("" + i);
		}
		
		System.out.println(datas.size());
	}
	
	
	
}
