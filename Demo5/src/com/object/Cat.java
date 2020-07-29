package com.object;

import java.awt.Color;

//基类
public class Cat {

	// 基类属性
	private Color color;

	// 基类方法
	

	public void Mio() {
		System.out.println("猫 喵喵喵~");
	}

	public void lick() {
		System.out.println("猫 舔毛");
	}

	// 成员定义方法
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
