package com.cc.test;
//�����ڵ�һ��

//import �ڰ����������м�
import java.lang.String;

//2.import��
//������    ������������
import com.cc.object.*;
//ָ����    ����������
import com.cc.object.Dog;

public class Demo {
	public static void main(String args[]) {

		// 1.ȫ��
		com.cc.object.Dog dog = new com.cc.object.Dog();
		dog.bark();
		// 2.import
		Dog dog2 = new Dog();
		dog2.bark();

		// �������������
		// ��ͬ��
		
		// public
		dog2.id = 1;
		// protected  �޷�����
		//dog2.name = "��ë";

		// private �޷�����
		// color = "�ߵ�";

		// ȱʡ   �޷�����
		//age = 5;

	}

}
