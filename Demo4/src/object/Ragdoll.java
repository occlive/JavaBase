package object;

import java.awt.Color;

//����
//������

//���̳�
public class Ragdoll extends Cat {
	// ������ӵ�����
	private String tail;
	private String emotion;
	

	//���췽��
	
	public Ragdoll() {
		super(Color.WHITE,100);
		//�����ڵ�һ��
		//super�ķ���
		//��private����
		System.out.println("super id"+super.id);
		System.out.println("super color"+super.color);
		//����
		super.eat();
		
	}
	
	//������д
	
	//������С����Ȩ��
	//������дprivate����
	//������д��final���η���
	//�����б�һ��
	//��������ͬ
	//����ֵ��ͬ������
	/*
	 * protected void eat() {
	 * 
	 * System.out.println("��żè �Է�"); }
	 */
	

	
	public void Mio() {
		System.out.println("��żè ������~");
	}
	
	// ������ӵķ���
	public void sleep() {
		System.out.println("��żè ˯��");
		//�̳з��ʻ�������
		//��������
		//private
		id = 1;
		//protect
		color = Color.WHITE;
		//private �޷�����
		//height = 100;
		
		
	}

	// ��Ա���巽��
	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}

	public String getEmotion() {
		return emotion;
	}

	public void setEmotion(String emotion) {
		this.emotion = emotion;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	
}
