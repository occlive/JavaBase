
public class Demo {
	public static void main(String[] args) {
		
		
		
		
		//���ء�ʵ������˳��
		Circle c = new Circle(3);
		
		System.out.println("---------------------------------");
		
		//��̬�ڲ���
		//��ֱ����Ϊ��ͨ��ʹ��
		Circle.MoreCircle mc = new Circle.MoreCircle();
		mc.printMore();
		System.out.println("---------------------------------");
		
		//��̬����
		
		System.out.println(Circle.COUNT);
		c.COUNT++;
		System.out.println(c.COUNT);
		
		//��̬�����޷��ı�
		System.out.println(Circle.getNum());
		
		System.out.println("---------------------------------");
		//��̬����
		Circle.printNum();
		
		//��̬��������
		Circle.Not();
		
		System.out.println("--------------��̬���Թ���-------------------");
		
		//Circleһ��ʵ�����˶��ٸ�����?
		Circle c1 = new Circle(5);
		c1.COUNT = 20;
		
		System.out.println(c1.getR());
		System.out.println(c1.COUNT);
		
		Circle c2 = new Circle(10);
		
		System.out.println(c2.getR());
		System.out.println(c2.COUNT);
		
		Circle.COUNT = 10;
		System.out.println(Circle.COUNT);
		//outҲ�Ǿ�̬����
		
	}

}
