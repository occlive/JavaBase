package cc.demo;

import cc.object.Outer;
import cc.object.Outer.Inner;
import cc.object.Outer2;
import cc.object.Outer3;
import cc.object.Outer4;

public class Demo {

	public static void main(String args[]) {
		
		//��Ա�ڲ���
		
		Outer out = new Outer();
		Inner in = out.creat();
		in.print();
		//�ⲿ����ⲿ����
	
		System.out.println(out.id);
		System.out.println(in.id);
		
		System.out.println("---------------");
		//�ֲ��ڲ���
		Outer2 out2 = new Outer2();
		out2.print(10);
		
		
		System.out.println("---------------");
		//�����ڲ���
		Outer3 out3 = new Outer3() {

			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("�����ڲ���ʵ�ַ���");
			}
			
			
		};
		out3.print();
		
		System.out.println("---------------");
		//��̬�ڲ���
		Outer4.Inner in4 = new Outer4.Inner();
		in4.print();
		
		
	}
}
