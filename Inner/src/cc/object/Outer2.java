package cc.object;
//局部内部类实例

import cc.object.Outer.Inner;

public class Outer2 {
	public int id;
	private String str;
	//成员方法
	
	//外包方法
	public void print(int x) {
		
		System.out.println("外部类方法");
		final int number = 001;
		String name = "外包方法";
		
		//局部内部类
		//不能加其他修饰符
		class Inner{
			public int id;
			private String str;
			
			public void print() {
				//访问内部类变量
				id = 2;
				Inner.this.id = 4;
				//可以访问外部类的成员
				str = "局部内部类";
				System.out.println(str);
				println();
				//可访问参数
				System.out.println("参数是："+ x);
				//访问外包方法final值
				System.out.println("方法常量是："+ number);
//				name = "";
			}
			
		}
		//创建局部内部类对象
		Inner in = new Inner();
		//调用局部内部类方法
		in.print();
		
	}
	
	private void println() {
		System.out.println("外部类隐藏方法");
	}
	
}
