package com.demo;

import com.object.*;

public class Demo {
	
	public static void main(String args[]) {
		
		//��̬
		
		//����ת��
		//��̬ʵ��
		//ͬһ���������ڲ�ͬ����Ķ��󣬽�������ͬ��ִ�н��
		Cat cat = new Ragdoll();
		cat.Mio();
		cat = new MaineCoon();
		cat.Mio();
		cat = new Siamese();
		cat.Mio();
		
		System.out.println("����������������������������������������������������");
		//ִ�з���
		//ǰ�᣺�������õ������������
		//1.�����ж��壬����������д�ķ���
		cat.Mio();
		//2.�����ж��壬��������û����д�ķ���
		cat.lick();
		//3.������û�У��������ж���ķ���
		//cat.eat();
		
	
	}

}
