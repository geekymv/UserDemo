package com.geekymv.exception;

public class ExceptionMethods {
	
	public static void main(String[] args) {
		try {
			
			throw new Exception("Here's my exception");
			
		} catch (Exception e) {
			System.out.println("e.getMessage() -->" + e.getMessage());
			System.out.println("e.toString() -->" + e.toString());
			e.printStackTrace();
		}
		
	}

}
