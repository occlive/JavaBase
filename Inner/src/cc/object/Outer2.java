package cc.object;
//�ֲ��ڲ���ʵ��

import cc.object.Outer.Inner;

public class Outer2 {
	public int id;
	private String str;
	//��Ա����
	
	//�������
	public void print(int x) {
		
		System.out.println("�ⲿ�෽��");
		final int number = 001;
		String name = "�������";
		
		//�ֲ��ڲ���
		//���ܼ��������η�
		class Inner{
			public int id;
			private String str;
			
			public void print() {
				//�����ڲ������
				id = 2;
				Inner.this.id = 4;
				//���Է����ⲿ��ĳ�Ա
				str = "�ֲ��ڲ���";
				System.out.println(str);
				println();
				//�ɷ��ʲ���
				System.out.println("�����ǣ�"+ x);
				//�����������finalֵ
				System.out.println("���������ǣ�"+ number);
//				name = "";
			}
			
		}
		//�����ֲ��ڲ������
		Inner in = new Inner();
		//���þֲ��ڲ��෽��
		in.print();
		
	}
	
	private void println() {
		System.out.println("�ⲿ�����ط���");
	}
	
}
