package demo;

import object.Cat;
import object.Ragdoll;

public class Demo {
	
	public static void main(String args[]) {
		
		//�̳з��ʻ�������
		//�ڱ���/������
		//��ͬ��
		Cat cat = new Cat();
		//public
		cat.id = 1;
		//protected ���ɷ���
		//private ���ɷ���
		
		//�������ò���������
		Cat cat2 = new Ragdoll();
		
		//�������͵����ÿ��Ե��û����ж�������Ժͷ���
		cat2.eat();
		//������д
		cat2.Mio();
		
		//���ܵ����������ж����������û�еķ�����
		//cat2.sleep();
		
		
		System.out.println("---------------------------------");
		Ragdoll doll = new Ragdoll();
		doll.sleep();
		
	}

}
