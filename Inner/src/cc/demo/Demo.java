package cc.demo;

import cc.object.Outer;
import cc.object.Outer.Inner;
import cc.object.Outer2;
import cc.object.Outer3;
import cc.object.Outer4;

public class Demo {

	public static void main(String args[]) {
		
		//成员内部类
		
		Outer out = new Outer();
		Inner in = out.creat();
		in.print();
		//外部类的外部访问
	
		System.out.println(out.id);
		System.out.println(in.id);
		
		System.out.println("---------------");
		//局部内部类
		Outer2 out2 = new Outer2();
		out2.print(10);
		
		
		System.out.println("---------------");
		//匿名内部类
		Outer3 out3 = new Outer3() {

			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类实现方法");
			}
			
			
		};
		out3.print();
		
		System.out.println("---------------");
		//静态内部类
		Outer4.Inner in4 = new Outer4.Inner();
		in4.print();
		
		
	}
}
