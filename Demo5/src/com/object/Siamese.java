package com.object;

public class Siamese extends Cat {

	// 派生类属性
	private int size;

	// 重写方法
	@Override
	public void Mio() {
		// TODO Auto-generated method stub
		System.out.println("暹罗猫 喵喵喵~");
	}

	// 自定义方法
	public void eat() {
		System.out.println("暹罗猫 吃饭");
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
