package com.object;

//Cat��
//ʵ�ֶ���ӿ�
//
public class Cat implements Train,GrowUp {

	
	//�ӿڷ�������ʵ��
	//���abstract��û�κ����εķ���������ʵ��
	//static��default��������
	@Override
	public void kneading() {
		// TODO Auto-generated method stub
		System.out.println("èè ����");
	}

	@Override
	public void CatchFish() {
		// TODO Auto-generated method stub
		System.out.println("èè ׽��");
	}

	
	//������д
	//���ܼ�default
	@Override
	public /* default */ void sleep() {
		// TODO Auto-generated method stub
		GrowUp.super.sleep();
		System.out.println("èè ˯��");
	}
	
	
	
	

}
