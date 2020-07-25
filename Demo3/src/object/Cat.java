package object;

import java.awt.Color;

//面向对象
//类
public class Cat {
	//属性
	public int id = 1;
	//private实现封装
	//private修饰的成员属性和方法只能在类内；类外无法访问
	private String name;
	private Type type;
	private Color color;
	
	//行为、方法
	
	//无返回值
	public void eat() {
		System.out.println("吃一斤猫粮");
	}
	
	public void lick() {
		System.out.println("舔毛");
	}
	
	
	//方法重载
	public void lick(int time) {
		System.out.println("舔毛 "+time + " 分钟");
	}
	
	public void lick(int time,String name) {
		System.out.println("和 "+name+" 一起舔毛 "+time + " 分钟");
	}

	public void lick(String name,int time) {
		System.out.println("和 "+name+" 一起舔毛 "+time + " 分钟");
	}
	
	//成员定义方法
	//有返回值
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
