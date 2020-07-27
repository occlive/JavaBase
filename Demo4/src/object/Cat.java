package object;

import java.awt.Color;

//基类
//父类
//超类
public class Cat {
	// 基类属性
	public int id = 1;
	protected Color color;
	private int height;
	private String tail;
	
	//构造方法
	public Cat() {
		
	}
	
	public Cat(Color color,int height) {
		//继承访问基类问题
		//在本类内
		//protected
		this.color = color;
		//private
		this.height = height;
		//public
		this.id++;
	}

	// 基类方法
	public void eat() {
		System.out.println("猫 吃饭");
	}
	
	public void Mio() {
		System.out.println("猫 喵喵喵~");
	}

	private void lick() {
		System.out.println("猫 舔毛");
	}
	// 成员定义方法

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}
	
	

}
