
public class Demo {
	public static void main(String[] args) {
		
		
		
		
		//加载、实例化的顺序
		Circle c = new Circle(3);
		
		System.out.println("---------------------------------");
		
		//静态内部类
		//可直接作为普通类使用
		Circle.MoreCircle mc = new Circle.MoreCircle();
		mc.printMore();
		System.out.println("---------------------------------");
		
		//静态属性
		
		System.out.println(Circle.COUNT);
		c.COUNT++;
		System.out.println(c.COUNT);
		
		//静态常量无法改变
		System.out.println(Circle.getNum());
		
		System.out.println("---------------------------------");
		//静态方法
		Circle.printNum();
		
		//静态常量方法
		Circle.Not();
		
		System.out.println("--------------静态属性公用-------------------");
		
		//Circle一共实例化了多少个对象?
		Circle c1 = new Circle(5);
		c1.COUNT = 20;
		
		System.out.println(c1.getR());
		System.out.println(c1.COUNT);
		
		Circle c2 = new Circle(10);
		
		System.out.println(c2.getR());
		System.out.println(c2.COUNT);
		
		Circle.COUNT = 10;
		System.out.println(Circle.COUNT);
		//out也是静态属性
		
	}

}
