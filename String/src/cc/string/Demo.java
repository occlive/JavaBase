package cc.string;


//�ַ���������
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//һ����ֵ����ֵ�޷��ı�
//		˽�еĳ����ַ�����
		//��ָ����ڴ�ֵ�����޸ģ������Ըı�ָ��
		//��ʼ��
		//1.���췽��   ����
		String str = new String("������");
		String str3 = new String("������");
		//2.������ʼ��  ������
		String str2 = "������";
		
		//��ַ�Ƚ�
		boolean b;
		b = str==str2?true:false;
		System.out.println(b);
		
		//ֵ��ͬ��ͬһ��������ַ��ͬ
		b = str==str3?true:false;
		System.out.println(b);
		
		//ֵ�Ƚ�
		b = str.equals(str2);
		System.out.println(b);
		
		//�ַ�������
		//1.concat
		str = str.concat(str);
		System.out.println(str);
		//2. +
		str2+=str2;
		System.out.println(str2);
		
		
		//�ַ�������
		str2 = "abcdef";
		System.out.println(str2.indexOf("ab"));
		
		System.out.println(str2.lastIndexOf("ab"));
		
		System.out.println(str2.charAt(0));
		
		str2.startsWith(str, 0);
		
		//�ַ����ָ�
		str2 = "m,i,o,m,i,o,m,i,o";
		String[]  strArr = str2.split(",");
		for(String s:strArr) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		//�ַ����Ƚ�
		/*
		 * ���ַ���������ַ��������ַ��Ƚ�
		 * ��ͬλ�ã��ַ���ͬ�����
		 * ��ͬ�򷵻��ַ����ַ���ȥ�����ַ����ַ��Ĳ�ֵ
		 * 
		 * ���֮ǰֵ��ͬ�����ǳ��Ȳ�ͬ��
		 * �����ַ������ȼ�ȥ�����ַ������ȵĲ�ֵ
		 */
		str = new String("aa");
		str2 = "aaaaa";
		int a = str.compareTo(str2);
		System.out.println(a);
		
		//���Դ�Сд��ֵ�Ƚ�
		str = new String("AbCdE");
		str2 = "abcde";
		b = str.equalsIgnoreCase(str2);
		System.out.println(b);
		
		//�ַ����滻
		str = new String("��a��a��a");
		str = str.replace('a','~');
		System.out.println(str);
		
		//�ַ������ִ�
		str = str.substring(0,2);
		System.out.println(str);
		
		//�ַ�����Сдת��
		str2 = str2.toUpperCase();
		System.out.println(str2);
		
		str2 = str2.toLowerCase();
		System.out.println(str2);
		
		
	}

}
