package com.object;

public class MaineCoon extends Cat {

	// ����������
	private int size;
	public int id;

	// ��д����
	@Override
	public void Mio() {
		// TODO Auto-generated method stub
		System.out.println("����è ������~");
	}

	@Override
	public void lick() {
		// TODO Auto-generated method stub
		System.out.println("����è ��ë");
	}

	// �Զ��巽��
	public void eat() {
		System.out.println("����è �Է�");
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
