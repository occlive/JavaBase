package cc.demo;

public class Demo {

	
	public static void main(String args[]) {
		
		
		Integer i = new Integer(1);
		System.out.println(i);
		//����
		int j = i.intValue();
		
		j++;
		//װ��
		//ԭ�еİ�װ����Ϊ�ı�ֵ
		//�������ڴ��ַ�ı�
		i = new Integer(j);
		System.out.println(i);
		
		//�Զ�װ��
		Integer i2 = new Integer(10);
		i2++;
		System.out.println(i2);
	}
}
