package object;

import java.awt.Color;

public class Dog {
	private String name;
	private Type type;
	private Color color;

	//���췽��
	public Dog() {

	}

	public Dog(String str) {
		//this��������
		this.name = str;
	}
	
	//this���ñ���Ĺ��췽��
	public Dog(String str,Type type) {
		this(str);
		//this�����ڵ�һ��
		this.type = type;
		//this���÷���
		this.bark();
	}
	
	//����
	public Dog bark() {
		System.out.println("����");
		return this;
	}

	//��Ա����
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	

}
