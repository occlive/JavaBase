public class Demo{
	public static void main(String[] args) {
		//System.out标准输出设备
		int a = 10;
		int b = 5;
		int c;
		c = a + b;  //c = 15
		a = a + 1;	//a = 11

		//1.println 输出打印换行
		
		System.out.println(++a);  //a = 12
		//2.print 输出打印不换行
		System.out.print(c);	//c = 15
		//3.printf 必须要用参数，且不换行
		System.out.printf("%s",a);  //a = 12
		
		M(a);
		System.out.println(a);
		
	}
	
	//公有静态方法
	public static void M(int a) {
		a = a * 30;
		
	}

}
