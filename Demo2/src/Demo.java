public class Demo{
	public static void main(String[] args) {
		//System.out��׼����豸
		int a = 10;
		int b = 5;
		int c;
		c = a + b;  //c = 15
		a = a + 1;	//a = 11

		//1.println �����ӡ����
		
		System.out.println(++a);  //a = 12
		//2.print �����ӡ������
		System.out.print(c);	//c = 15
		//3.printf ����Ҫ�ò������Ҳ�����
		System.out.printf("%s",a);  //a = 12
		
		M(a);
		System.out.println(a);
		
	}
	
	//���о�̬����
	public static void M(int a) {
		a = a * 30;
		
	}

}
