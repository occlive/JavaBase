package object;

import java.awt.Color;

//����
//����
//����
public class Cat {
	// ��������
	public int id = 1;
	protected Color color;
	private int height;
	private String tail;
	
	//���췽��
	public Cat() {
		
	}
	
	public Cat(Color color,int height) {
		//�̳з��ʻ�������
		//�ڱ�����
		//protected
		this.color = color;
		//private
		this.height = height;
		//public
		this.id++;
	}

	// ���෽��
	public void eat() {
		System.out.println("è �Է�");
	}
	
	public void Mio() {
		System.out.println("è ������~");
	}

	private void lick() {
		System.out.println("è ��ë");
	}
	// ��Ա���巽��

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}
	
	

}
