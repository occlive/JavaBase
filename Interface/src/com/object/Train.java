package com.object;

//接口
//可以看作特别的抽象类
//接口无法继承类
public interface Train /* extends */ {
	
	//不包含变量
	
	//常量
	//可以不加final
	//必须初始化
	int id  = 1;
	final String number = "001";
	
	
	//抽象方法
	//可以不加abstract
	void kneading();
	

}
