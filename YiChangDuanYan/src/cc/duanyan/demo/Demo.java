package cc.duanyan.demo;

public class Demo {
	public static void main(String args[]) {
		
		//1.第一种
		assert true;
		System.out.println("顺利执行");
		
		//2.第二种
		assert false:"hello";
		System.out.println("顺利执行");
		
	}

}
