package com.demo;

import com.object.*;

public class Demo {
	
	public static void main(String args[]) {
		
		//多态
		
		//向上转型
		//多态实现
		//同一操作作用于不同的类的对象，将产生不同的执行结果
		Cat cat = new Ragdoll();
		cat.Mio();
		cat = new MaineCoon();
		cat.Mio();
		cat = new Siamese();
		cat.Mio();
		
		System.out.println("——————————————————————————");
		//执行方法
		//前提：基类引用调用派生类对象
		//1.基类中定义，派生类中重写的方法
		cat.Mio();
		//2.基类中定义，派生类中没有重写的方法
		cat.lick();
		//3.基类中没有，派生类中定义的方法
		//cat.eat();
		
	
	}

}
