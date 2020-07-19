

public class Demo2 {
	public static void main(String[] args) {
		//儉桟送殻
		System.out.println("！！！！！！！！！！！for！！！！！！！！！！！！！！！");
		for(int i = 0;i < 5;i++) {
			System.out.println("Hello World");
		}
		
		System.out.println("！！！！！！！！！！！while！！！！！！！！！！！！！！！");
		int i = 0;
		while(i<10) {
			System.out.println("while_"+i++);
		}
		System.out.println("！！！！！！！！！！！do while！！！！！！！！！！！！！！！");
		i = 4;
		do {
			System.out.println("do_"+i--);
			
		}while(i>0);
		
		System.out.println("！！！！！！！！！！！奐膿侏for！！！！！！！！！！！！！！！");
		int[] arr = new int[] {1,2,3,4,5,6,7};
		for(int a:arr) {
			System.out.println(a);
		}
		
		
	}
}