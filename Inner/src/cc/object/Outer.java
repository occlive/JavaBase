package cc.object;

//��Ա�ڲ���ʵ��

public class Outer {
	
	public int id;
	private String str;
	//��Ա����
	public void print() {
		System.out.println("�ⲿ�෽��");
	}
	
	private void println() {
		System.out.println("�ⲿ�����ط���");
	}
	
	
	
	//��Ա�ڲ���
	public class Inner{
		public int id;
		private String str;
		
		public void print() {
			//�����ڲ������
			id = 2;
			Inner.this.id = 4;
			//�����ⲿ���Ա
			Outer.this.id = 1;
			Outer.this.str = "��Ա�ڲ���";
			Outer.this.println();
		}
		
	}
	
	public Inner creat() {
		//��Ա�ڲ���Ĵ���
		Inner i = new Inner();
		
		return i;
	}
	

}
