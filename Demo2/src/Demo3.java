
public class Demo3 {

	
	public static void main(String args[]) {
		int a = 10, b = 20;
		
		Point p = new Point(60, 80);
		p.change(a, b);// 方法传参，传的是实参副本，不是实参本身
		System.out.println("a = " + a + "\tb = " + b);

		System.out.println("---------------------------------");

		p.info();
		p.change(p);
		p.info();
	}
}
