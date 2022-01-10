package com.company.designpattern.singleton.enumm;

public enum Singleton {

	INSTANCE;
	
	private int id = 1;
	private String name = "Singleton object";
	
	
	public void foo() {
		System.out.println(id);
	}
	
	
	public void bar() {
		System.out.println(name);
	}
	
}
