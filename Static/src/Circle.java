
public class Circle extends Shape {
	// ��̬����
	// ����һ��
	// ��������࣬������������ĳ������
	//���о�̬
	public static int COUNT = 0;
	//˽�о�̬����
	private static final int num = 0;
	
	
	//�Ǿ�̬����
	private double r;

	// ��̬�����
	static {
		// ��̬����飻�����ڹ��췽��
		// �����о�̬���Գ�ʼ�������Ӹ�ֵ
		System.out.println("���� static�����");
	}

	// �Ǿ�̬�����
	{

		System.out.println("���� ��ͨ�����");

	}

	// ���๹�췽��
	public Circle(double R) {
		this.r = R;
		System.out.println("���� ���췽��");
		COUNT++;
	}

	
	public double getR() {
		return r;
	}

	public void setR(double R) {
		r = R;
	}
	
	//��̬����

	public static int getNum() {
		return num;
	}
	
	public static void printNum() {
		//ֻ�ܵ���static���ԡ�����
		int i = getNum();
		System.out.println(i);
		i = num;
		System.out.println(i);
		i = COUNT;
		System.out.println(i);
		//������super��this
		//super();
		//this.COUNT;
		
	}
	
	//��̬��
	
	public static class MoreCircle {
		public void printMore() {
			
			System.out.println("��̬�ڲ���");
		}
	}

//   �޷�������д����ľ�̬��������
	/*
	 * public static final void Not() {
	 * 
	 * }
	 */
}
