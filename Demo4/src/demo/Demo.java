package demo;

import object.Cat;
import object.Ragdoll;

public class Demo {
	
	public static void main(String args[]) {
		
		//继承访问基类问题
		//在本类/子类外
		//不同包
		Cat cat = new Cat();
		//public
		cat.id = 1;
		//protected 不可访问
		//private 不可访问
		
		//基类引用操作派生类
		Cat cat2 = new Ragdoll();
		
		//基类类型的引用可以调用基类中定义的属性和方法
		cat2.eat();
		//方法重写
		cat2.Mio();
		
		//不能调用派生类中定义而基类中没有的方法。
		//cat2.sleep();
		
		
		System.out.println("---------------------------------");
		Ragdoll doll = new Ragdoll();
		doll.sleep();
		
	}

}
