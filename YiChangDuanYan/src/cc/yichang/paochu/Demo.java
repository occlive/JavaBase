package cc.yichang.paochu;

public class Demo {
	
	
	public static void main(String args[]) {
		Arith ari = new Arith();
		
		//���÷���
		//���׳����쳣���д���
		try {
			ari.div(1, 0);
		}catch(ArithmeticException a) {
			System.out.println("��ĸΪ0");
		}
		
		
		//�Զ����쳣
		try {
			ari.get(false);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		
	}
}
