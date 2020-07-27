package com.cc.test;
//包名在第一行

//import 在包和类声明中间
import java.lang.String;

//2.import包
//整个包    按需类型引入
import com.cc.object.*;
//指定类    单类型引入
import com.cc.object.Dog;

public class Demo {
	public static void main(String args[]) {

		// 1.全名
		com.cc.object.Dog dog = new com.cc.object.Dog();
		dog.bark();
		// 2.import
		Dog dog2 = new Dog();
		dog2.bark();

		// 本类和派生类外
		// 不同包
		
		// public
		dog2.id = 1;
		// protected  无法访问
		//dog2.name = "大毛";

		// private 无法访问
		// color = "斑点";

		// 缺省   无法访问
		//age = 5;

	}

}
