package demo;

import object.Cat;
import object.Dog;
import object.Type;

public class Demo2 {
//���췽��
	public static void main(String args[]) {
		
		
		//Cat δ���幹�췽��
		//ϵͳ�Զ������޲������ݵĹ��췽��
		Cat cat  = new Cat();
		
		//���ֶ������ֹ��췽��
		Dog dog = new Dog();
		Dog dog2 = new Dog("����");
		Dog dog3 = new Dog("�±ȷ�",Type.����);
		
		System.out.println(dog.getName());
		System.out.println(dog2.getName());
		System.out.println(dog3.getName()+"������ĺô����");
		
		//this�����÷�
		dog3.bark().bark();
		
		
	}
}
