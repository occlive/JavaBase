public class Demo {
	public static void main(String[] args) {

		// ��ʶ��

		// Syntax error
		/*
		 * �����ǹؼ��� �������ֿ�ͷ ���������֡���ĸ���»��ߡ�$������ַ� �����Ǳ�����
		 */
//		int int = 1;	
//		String 123ww = "qwe";
//		long #abc = 123;
//		int const = 100;

		// Syntax right
		// ��������
		// ����
		byte bt = 1;
		short st = 2;
		int len = 10;
		long lon = 100L;

		// ����
		// float���͵�ֵ��Ҫ��f
		float f = 10.0f;
		double d = 100.0;

		// �ַ�
//		char�ַ��õ���������
		char ch = 'a';

		// ����
		boolean b = true;

		// ��������
		// ����
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		// ��
		// �Լ������
		Number num = new Number();
		// �ӿ�
		// Numberʵ��Parent�ӿڵ�add����
		num.add();
		// ����
		Type t = Type.CITE;
		
		System.out.println("����������������������out������������������������������");

		// �����Ĳ���
		int m = 10;
		int n = 5;
		int s;
		s = m+n;
		// System.out��׼����豸
		// 1.println �����ӡ����
		System.out.println(m);
		// 2.print �����ӡ������
		System.out.print(n);
		// 3.printf ����Ҫ�ò������Ҳ����� 
		System.out.printf("%d",s);
		
		
		System.out.println("");
		System.out.println("�������������������������������������������������������������");
		
//		���������	
		s = m + n;
		System.out.println(m+"+"+n+"="+s);
		s = m - n;
		System.out.println(m+"-"+n+"="+s);
		s = m * n;
		System.out.println(m+"*"+n+"="+s);
		s = m / n;
		System.out.println(m+"/"+n+"="+s);
		s = m % n;
		System.out.println(m+"%"+n+"="+s);
		
		System.out.println("�������������������������������������������������������������");
//		���������
		System.out.println("10++="+ 11 );
		System.out.println("++10="+ 11 );
		
		//++m,m++������		
		System.out.println("�ڵ�ǰ���ʽ��m=10,m++="+ m++);
		m-=1;
		System.out.println("�ڵ�ǰ���ʽ��m=10,++m="+ ++m);
		
		System.out.println("�������������������������Լ����������������������������������");
//		�Լ������
		System.out.println("5--="+ 4 );
		System.out.println("--5="+ 4 );
		
		//--n,n--������		
		System.out.println("�ڵ�ǰ���ʽ��n=5,n--="+ n--);
		n+=1;
		System.out.println("�ڵ�ǰ���ʽ��n=5,--n="+ --n);
		
		System.out.println("��������������������������ϵ���������������������������������");
//		��ϵ�����	
		
		if(m>=n) {
			System.out.println(m+">="+n);
		}else {
			System.out.println(m+"<"+n);
		}
		
		
		
		System.out.println("�������������������������߼����������������������������������");
//		�߼������	

		if(1==1 && m >= n) {
			System.out.println(m+">="+n);
		}else if(2>6 || 0!=0) {
			System.out.println("�����ܴ�ӡ");
		}else if(!true){
			System.out.println("�����ܴ�ӡ");
		}else {
			System.out.println("����");
		}
		
		
		System.out.println("��������������������������Ԫ���������������������������������");
//		��Ԫ�����
		
		s = m >= n?m:n;
		System.out.println(s +"=="+ m+">="+n+"?"+m+":"+n+";");
		
		System.out.println("��������������������������ֵ���������������������������������");
//		��ֵ�����	
		s = m + n;
		System.out.println(s+"=="+m+"+"+n);
		
		s = m;
		s+=1;
		System.out.println(s+"=="+m+"+=1");
		s = m;
		s-=1;
		System.out.println(s+"=="+m+"-=1");
		
		s = n;
		s*=2;
		System.out.println(s+"=="+n+"*=2");
		
		s = n;
		s%=2;
		System.out.println(s+"=="+n+"%=2");
		
		System.out.println("������������������������λ���������������������������������");
//		λ�����
		boolean b1 = true;
		boolean b2 = false;
		boolean b3;
		
		b3 = b1 & b2;
		System.out.println(b1+"&"+b2+"="+b3);
		b3 = b1 | b2;
		System.out.println(b1+"|"+b2+"="+b3);
		b3 = b1^b2;
		System.out.println(b1+"^"+b2+"="+b3);
		
		System.out.println("�������������������������ַ����������������������������������������");
//		�ַ������������
		String str1 = "i ";
		String str2 = "love ";
		String str3 = "u";
		str1 = str1 + str2 + str3;
		System.out.println(str1);
		
		System.out.println("������������������������instanceof�Ƚϡ���������������������������");
//		instanceof�Ƚ�
		
		//Parent��Ϊ�ӿڣ���������
		//Number��Parent�ӿڵ�ʵ����
		//num��Number���ʵ����
		boolean bl = num instanceof Parent;
		System.out.println(bl);
		


	}
}
