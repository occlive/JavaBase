package cc.demo;

import cc.object.Methods;
import cc.object.Methods2;
import cc.object.Methods3;

public class Demo2 {
	public static void main(String args[]) {

		
		//方法重载问题
		//能否直接匹配
		//按排序比重
		//1.基本类型加宽
		
		short s = 10;
		Methods m = new Methods();
		
		m.get(s);
		
		//2.自动装箱
		int i = 10;
		Methods2 m2 = new Methods2();
		m2.get(i);
		
		
		//装箱后再加宽
		
		
		//3.可变元参数
		short s1 = 10;
		short s2 = 10;
		Methods3 m3 = new Methods3();
		m3.get(s1,s2);
		
		
	}

}
