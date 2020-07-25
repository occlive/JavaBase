package demo;

import java.awt.Color;

import object.Cat;
import object.Type;

public class Demo {
	public static void main(String args[]) {
		
		//对象
		//可操作的实体
		Cat cat = new Cat();
		//访问成员
		cat.setName("咪咪");
		cat.setColor(Color.ORANGE);
		cat.setType(Type.土猫);
		System.out.println(cat.id);
		//访问方法
		cat.eat();
		
		System.out.println("---------------------------------");
		//方法重载测试
		cat.lick();
		cat.lick(10);
		cat.lick(10, "大毛");
		cat.lick("小毛", 5 );
		
	}
}
