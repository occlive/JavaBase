package demo;

import object.Cat;
import object.Dog;
import object.Type;

public class Demo2 {
//构造方法
	public static void main(String args[]) {
		
		
		//Cat 未定义构造方法
		//系统自动生成无参无内容的构造方法
		Cat cat  = new Cat();
		
		//三种对象，三种构造方法
		Dog dog = new Dog();
		Dog dog2 = new Dog("旺财");
		Dog dog3 = new Dog("陈比方",Type.土狗);
		
		System.out.println(dog.getName());
		System.out.println(dog2.getName());
		System.out.println(dog3.getName()+"！妈妈的好大儿！");
		
		//this参数用法
		dog3.bark().bark();
		
		
	}
}
