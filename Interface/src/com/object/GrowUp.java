package com.object;

public interface GrowUp {
	
	
	//׽��
	void CatchFish();
	
	
	
	//���·�������д������
	//���ر���ʵ��
	//static����
	static void eat() {
		System.out.println("�Է�");
	}
	
	//��д��ʱ���ܼ�default
	//default
	default void sleep() {
		System.out.println("˯��");
	}

}
