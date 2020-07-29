package com.object;

//Cat类
//实现多个接口
//
public class Cat implements Train,GrowUp {

	
	//接口方法必须实现
	//添加abstract、没任何修饰的方法都必须实现
	//static、default方法除外
	@Override
	public void kneading() {
		// TODO Auto-generated method stub
		System.out.println("猫猫 踩奶");
	}

	@Override
	public void CatchFish() {
		// TODO Auto-generated method stub
		System.out.println("猫猫 捉鱼");
	}

	
	//方法重写
	//不能加default
	@Override
	public /* default */ void sleep() {
		// TODO Auto-generated method stub
		GrowUp.super.sleep();
		System.out.println("猫猫 睡觉");
	}
	
	
	
	

}
