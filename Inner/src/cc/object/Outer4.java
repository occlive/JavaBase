package cc.object;

//��̬�ڲ���ʵ��

public class Outer4 {
	
	public static int id;
	private String str;
	//��Ա����
	public void print() {
		System.out.println("�ⲿ�෽��");
	}
	
	private static void println() {
		System.out.println("�ⲿ�����ط���");
	}
	
	
	
	//��̬�ڲ���
	public static class Inner{
		private static String str;
		
		//�ɶ��徲̬����
		public static void print() {
			//��̬�ڲ���ֱ�ӷ����ⲿ��ľ�̬��Ա
			System.out.println("��̬�ⲿ�����ԣ�"+ id);
			println();
		}
		
	}

}
