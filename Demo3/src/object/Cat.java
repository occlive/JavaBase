package object;

import java.awt.Color;

//�������
//��
public class Cat {
	//����
	public int id = 1;
	//privateʵ�ַ�װ
	//private���εĳ�Ա���Ժͷ���ֻ�������ڣ������޷�����
	private String name;
	private Type type;
	private Color color;
	
	//��Ϊ������
	
	//�޷���ֵ
	public void eat() {
		System.out.println("��һ��è��");
	}
	
	public void lick() {
		System.out.println("��ë");
	}
	
	
	//��������
	public void lick(int time) {
		System.out.println("��ë "+time + " ����");
	}
	
	public void lick(int time,String name) {
		System.out.println("�� "+name+" һ����ë "+time + " ����");
	}

	public void lick(String name,int time) {
		System.out.println("�� "+name+" һ����ë "+time + " ����");
	}
	
	//��Ա���巽��
	//�з���ֵ
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
