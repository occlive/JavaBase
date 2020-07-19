
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// System.in 标准输入设备
		int a = 5;
		int b = 10;
		int c;
		String ch;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("请输入a的值");
		a = s.nextInt();
		System.out.println("请输入b的值");
		b = s.nextInt();
		System.out.println("请输入运算符");
		ch = s.next();
		System.out.println("out :" + a + ch + b);
		//分支流程
		switch (ch) {
		case "+":
			c = a + b;
			System.out.println("out:" + a + ch + b + "=" + c);
			break;
		case "-":
			c = a - b;
			System.out.println("out:" + a + ch + b + "=" + c);
			break;

		}
		
		if(ch.equals("*")) {
			c = a * b;
			System.out.println("out:" + a + ch + b + "=" + c);
		}else if(ch.equals("/")) {
			c = a / b;
			System.out.println("out:" + a + ch + b + "=" + c);
		}


	}

}
