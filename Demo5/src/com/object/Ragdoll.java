package com.object;

import java.awt.Color;

public class Ragdoll extends Cat {

	// ����������
	private int size;

	// ��д����
	@Override
	public void Mio() {
		// TODO Auto-generated method stub
		System.out.println("��żè ������~");
	}

	@Override
	public void lick() {
		// TODO Auto-generated method stub
		System.out.println("��żè ��ë");
	}

	// �Զ��巽��

	public void eat() {
		System.out.println("��żè �Է�");
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
