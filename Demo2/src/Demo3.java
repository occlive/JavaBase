
public class Demo3 {

	
	public static void main(String args[]) {
		int a = 10, b = 20;
		
		Point p = new Point(60, 80);
		p.change(a, b);// �������Σ�������ʵ�θ���������ʵ�α���
		System.out.println("a = " + a + "\tb = " + b);

		System.out.println("---------------------------------");

		p.info();
		p.change(p);
		p.info();
	}
}
