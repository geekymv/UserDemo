package com.geekymv.test;

public enum ColorEnum {
	
	RED("红", "1"), BLUE("绿", "2"), GREEN("蓝", "3");

	private ColorEnum() {
	}
	
	private ColorEnum(String name, String value) {
		this.name = name;
		this.value = value;
	}
	private String name;
	private String value;
	
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public String getValue() {
		return value;
	}
	
//	public void setValue(String value) {
//		this.value = value;
//	}
	
	
}
