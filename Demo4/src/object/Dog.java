package object;

import java.awt.Color;

//final���εĻ���
public final class Dog {

	private String type;

	public void bark() {
		System.out.println("����");
		// �̳з��ʻ�������
		// �ڱ���/������
		// ͬ��
		Cat cat = new Cat();
		//protected
		cat.color = Color.white;
		//public
		cat.id = 1;
		//private �޷�����
	
	}
}
