package com.object;

public class MaineCoon extends Cat {

	// 派生类属性
	private int size;
	public int id;

	// 重写方法
	@Override
	public void Mio() {
		// TODO Auto-generated method stub
		System.out.println("缅因猫 喵喵喵~");
	}

	@Override
	public void lick() {
		// TODO Auto-generated method stub
		System.out.println("缅因猫 舔毛");
	}

	// 自定义方法
	public void eat() {
		System.out.println("缅因猫 吃饭");
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
