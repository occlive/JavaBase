package object;

import java.awt.Color;

public class Dog {
	private String name;
	private Type type;
	private Color color;

	//构造方法
	public Dog() {

	}

	public Dog(String str) {
		//this调用属性
		this.name = str;
	}
	
	//this调用本类的构造方法
	public Dog(String str,Type type) {
		this(str);
		//this必须在第一行
		this.type = type;
		//this调用方法
		this.bark();
	}
	
	//方法
	public Dog bark() {
		System.out.println("汪！");
		return this;
	}

	//成员方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	

}
