package cc.yichang.paochu;

public class Demo {
	
	
	public static void main(String args[]) {
		Arith ari = new Arith();
		
		//调用方法
		//对抛出的异常进行处理
		try {
			ari.div(1, 0);
		}catch(ArithmeticException a) {
			System.out.println("分母为0");
		}
		
		
		//自定义异常
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
