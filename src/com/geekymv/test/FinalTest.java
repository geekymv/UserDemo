package com.geekymv.test;

import org.junit.Test;

import com.geekymv.pojo.User;

public class FinalTest {
	
	private final int i;
	public FinalTest() {
		i = 1;
	}
	
	@Test
	public void finalAttributeTest() {
		/**
		 * fianl修饰的引用类型
		 */
		final User user = new User();
		user.setUsername("123");
		
		System.out.println(user);
		
		final int a = 1;
//		a = 2;
	}

}
