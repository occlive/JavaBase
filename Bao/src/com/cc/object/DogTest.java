package com.cc.object;

public class DogTest {

	public static void main(String args[]) {
		// 本类和派生类外
		// 同包

		Dog dog = new Dog();
		
		// public
		dog.id = 1;
		// protected
		dog.name = "大毛";

		// private 无法访问
		// color = "斑点";

		// 缺省
		dog.age = 5;

	}

}
