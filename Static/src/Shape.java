
public class Shape {
	
	
	public static final int shape = 1;
	
	//��̬�����
	static {
		
		System.out.println("���� static�����");
		
	}
	
	//�Ǿ�̬�����
	{
		
		System.out.println("���� ��ͨ�����");

	}
	
	//���췽��
	Shape() {
		super();
		System.out.println("���� ���췽��");

	}		
	
	public static final void Not() {
		System.out.println("���� ��̬��������");

	}
	
	

}
