package com.cc.object;

public class Dog {
	
	public int id;
	protected String name;
	private String color;
	int age;
	
	
	public void bark() {
		System.out.println("汪！");
		
		//同类内
		//public
		id = 1;
		//protected
		name = "大毛";
		//private
		color = "斑点";
		//缺省 
		age = 5;
	}

}
