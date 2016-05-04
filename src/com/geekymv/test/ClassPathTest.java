package com.geekymv.test;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;

public class ClassPathTest {
	
	@Test
	public void test() {
		Properties properties = System.getProperties();
		Set<Object> set = properties.keySet();
		
		for(Iterator<Object> iter = set.iterator(); iter.hasNext(); ) {
			Object key = iter.next();
			Object value = properties.get(key);
			System.out.println(key + "--->" + value);
		}
	}

}
