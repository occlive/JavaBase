package cc.demo;

public class Demo {

	
	public static void main(String args[]) {
		
		
		Integer i = new Integer(1);
		System.out.println(i);
		//拆箱
		int j = i.intValue();
		
		j++;
		//装箱
		//原有的包装器类为改变值
		//但引用内存地址改变
		i = new Integer(j);
		System.out.println(i);
		
		//自动装箱
		Integer i2 = new Integer(10);
		i2++;
		System.out.println(i2);
	}
}
