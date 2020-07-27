package object;

import java.awt.Color;

//final修饰的基类
public final class Dog {

	private String type;

	public void bark() {
		System.out.println("汪！");
		// 继承访问基类问题
		// 在本类/子类外
		// 同包
		Cat cat = new Cat();
		//protected
		cat.color = Color.white;
		//public
		cat.id = 1;
		//private 无法访问
	
	}
}
