package cc.object;

//静态内部类实例

public class Outer4 {
	
	public static int id;
	private String str;
	//成员方法
	public void print() {
		System.out.println("外部类方法");
	}
	
	private static void println() {
		System.out.println("外部类隐藏方法");
	}
	
	
	
	//静态内部类
	public static class Inner{
		private static String str;
		
		//可定义静态方法
		public static void print() {
			//静态内部类直接访问外部类的静态成员
			System.out.println("静态外部类属性："+ id);
			println();
		}
		
	}

}
