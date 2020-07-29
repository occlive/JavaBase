package com.object;

public interface GrowUp {
	
	
	//捉鱼
	void CatchFish();
	
	
	
	//以下方法可以写方法体
	//不必必须实现
	//static方法
	static void eat() {
		System.out.println("吃饭");
	}
	
	//重写的时候不能加default
	//default
	default void sleep() {
		System.out.println("睡觉");
	}

}
