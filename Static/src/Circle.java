
public class Circle extends Shape {
	// 静态属性
	// 共享一份
	// 属于这个类，不属于这个类的某个对象
	//公有静态
	public static int COUNT = 0;
	//私有静态常量
	private static final int num = 0;
	
	
	//非静态属性
	private double r;

	// 静态代码块
	static {
		// 静态代码块；优先于构造方法
		// 给所有静态属性初始化（复杂赋值
		System.out.println("子类 static代码块");
	}

	// 非静态代码块
	{

		System.out.println("子类 普通代码块");

	}

	// 子类构造方法
	public Circle(double R) {
		this.r = R;
		System.out.println("子类 构造方法");
		COUNT++;
	}

	
	public double getR() {
		return r;
	}

	public void setR(double R) {
		r = R;
	}
	
	//静态方法

	public static int getNum() {
		return num;
	}
	
	public static void printNum() {
		//只能调用static属性、方法
		int i = getNum();
		System.out.println(i);
		i = num;
		System.out.println(i);
		i = COUNT;
		System.out.println(i);
		//不能用super和this
		//super();
		//this.COUNT;
		
	}
	
	//静态类
	
	public static class MoreCircle {
		public void printMore() {
			
			System.out.println("静态内部类");
		}
	}

//   无法覆盖重写父类的静态常量方法
	/*
	 * public static final void Not() {
	 * 
	 * }
	 */
}
