package com.geekymv.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class ListCopyTest {

	
	@Test
	public void copyTest() {
		List<String> test = new ArrayList<String>();
		test.add("1");
		test.add("2");
		
		List<String> newList = new ArrayList<String>(2);
		
//		Collections.copy(newList, test);
		
		newList.addAll(test);
		
		test.remove(0);
		System.out.println(test);
		
		System.out.println(newList);
		
	}
}
