package cc.demo;

import cc.object.Methods;
import cc.object.Methods2;
import cc.object.Methods3;

public class Demo2 {
	public static void main(String args[]) {

		
		//������������
		//�ܷ�ֱ��ƥ��
		//���������
		//1.�������ͼӿ�
		
		short s = 10;
		Methods m = new Methods();
		
		m.get(s);
		
		//2.�Զ�װ��
		int i = 10;
		Methods2 m2 = new Methods2();
		m2.get(i);
		
		
		//װ����ټӿ�
		
		
		//3.�ɱ�Ԫ����
		short s1 = 10;
		short s2 = 10;
		Methods3 m3 = new Methods3();
		m3.get(s1,s2);
		
		
	}

}
