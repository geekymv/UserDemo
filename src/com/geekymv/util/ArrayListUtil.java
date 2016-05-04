package com.geekymv.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class ArrayListUtil {
	
	@Test
	public void array2List() {
		String[] arr = {"1", "2", "3"};
		List<String> list = new ArrayList<String>();
		list.add("1");
		Collections.addAll(list, arr);
		System.out.println(list);
	}
	
}
