package object;

import java.awt.Color;

//子类
//派生类

//单继承
public class Ragdoll extends Cat {
	// 子类添加的属性
	private String tail;
	private String emotion;
	

	//构造方法
	
	public Ragdoll() {
		super(Color.WHITE,100);
		//必须在第一行
		//super的访问
		//非private属性
		System.out.println("super id"+super.id);
		System.out.println("super color"+super.color);
		//方法
		super.eat();
		
	}
	
	//方法重写
	
	//不能缩小访问权限
	//不能重写private方法
	//不能重写被final修饰方法
	//参数列表一样
	//方法名相同
	//返回值相同或子类
	/*
	 * protected void eat() {
	 * 
	 * System.out.println("布偶猫 吃饭"); }
	 */
	

	
	public void Mio() {
		System.out.println("布偶猫 喵喵喵~");
	}
	
	// 子类添加的方法
	public void sleep() {
		System.out.println("布偶猫 睡觉");
		//继承访问基类问题
		//在子类中
		//private
		id = 1;
		//protect
		color = Color.WHITE;
		//private 无法访问
		//height = 100;
		
		
	}

	// 成员定义方法
	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}

	public String getEmotion() {
		return emotion;
	}

	public void setEmotion(String emotion) {
		this.emotion = emotion;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	
}
