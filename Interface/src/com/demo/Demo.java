package com.demo;

import com.object.GrowUp;
import com.object.Cat;
import com.object.Train;

public class Demo {
	
	
	public static void main(String args[]) {
		
		//接口无法实例化
		//Train t = new Train();
		
		Cat cat = new Cat();
		//访问接口方法实现
		cat.CatchFish();
		cat.kneading();
		
		//default方法
		cat.sleep();
		
		//通过类访问实现接口的常量
		System.out.println(cat.id);
		System.out.println(cat.number);
		
		
		//static方法
		GrowUp.eat();
		
		
		
	}

}
