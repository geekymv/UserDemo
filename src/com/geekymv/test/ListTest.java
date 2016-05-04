package com.geekymv.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListTest {
	
	@Test
	public void testList2Array() {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		
		String[] results = list.toArray(new String[list.size()]);

		System.out.println(results);
	}
	
	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("a");
//		list.add("b");
//		
//		for (String string : list) {
//			if(string.equals("a")) {
//				list.remove(string);
//			}
//			
//			System.out.println(string);
//		}
		
		 ArrayList<Integer> list = new ArrayList<Integer>();
	        list.add(2);
//	        Iterator<Integer> iterator = list.iterator();
//	        while(iterator.hasNext()){
//	            Integer integer = iterator.next();
//	            if(integer==2)
//	                list.remove(integer);
//	        }
	      for(int i = 0; i < list.size(); i++) {
	    	  if(i == 0) {
	    		  list.remove(list.get(i));
	    	  }
	      } 
		
	}
}
