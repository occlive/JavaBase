
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		//System.in ��׼�����豸
		int a=5;
		int b=10;
		int c;
		String ch;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("������a��ֵ");
		a = s.nextInt();
		System.out.println("������b��ֵ");
		b = s.nextInt();
		System.out.println("������c��ֵ");
		ch = s.next();
		System.out.println("out :" + a + ch + b);
		switch (ch) {
		case "+":
			c = a + b;
			System.out.println("out:" + a + ch + b + "=" + c);
			break;
		case "-":
			break;
		
		
		}
		System.out.println(a+b);
		// TODO Auto-generated method stub

	}

}
