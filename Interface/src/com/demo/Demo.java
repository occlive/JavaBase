package com.demo;

import com.object.GrowUp;
import com.object.Cat;
import com.object.Train;

public class Demo {
	
	
	public static void main(String args[]) {
		
		//�ӿ��޷�ʵ����
		//Train t = new Train();
		
		Cat cat = new Cat();
		//���ʽӿڷ���ʵ��
		cat.CatchFish();
		cat.kneading();
		
		//default����
		cat.sleep();
		
		//ͨ�������ʵ�ֽӿڵĳ���
		System.out.println(cat.id);
		System.out.println(cat.number);
		
		
		//static����
		GrowUp.eat();
		
		
		
	}

}
