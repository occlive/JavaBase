
public class Shape {
	
	
	public static final int shape = 1;
	
	//静态代码块
	static {
		
		System.out.println("父类 static代码块");
		
	}
	
	//非静态代码块
	{
		
		System.out.println("父类 普通代码块");

	}
	
	//构造方法
	Shape() {
		super();
		System.out.println("父类 构造方法");

	}		
	
	public static final void Not() {
		System.out.println("父类 静态常量方法");

	}
	
	

}
