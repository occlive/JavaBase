package demo;

import java.awt.Color;

import object.Cat;
import object.Type;

public class Demo {
	public static void main(String args[]) {
		
		//����
		//�ɲ�����ʵ��
		Cat cat = new Cat();
		//���ʳ�Ա
		cat.setName("����");
		cat.setColor(Color.ORANGE);
		cat.setType(Type.��è);
		System.out.println(cat.id);
		//���ʷ���
		cat.eat();
		
		System.out.println("---------------------------------");
		//�������ز���
		cat.lick();
		cat.lick(10);
		cat.lick(10, "��ë");
		cat.lick("Сë", 5 );
		
	}
}
