package cc.object;

//成员内部类实例

public class Outer {
	
	public int id;
	private String str;
	//成员方法
	public void print() {
		System.out.println("外部类方法");
	}
	
	private void println() {
		System.out.println("外部类隐藏方法");
	}
	
	
	
	//成员内部类
	public class Inner{
		public int id;
		private String str;
		
		public void print() {
			//访问内部类变量
			id = 2;
			Inner.this.id = 4;
			//访问外部类成员
			Outer.this.id = 1;
			Outer.this.str = "成员内部类";
			Outer.this.println();
		}
		
	}
	
	public Inner creat() {
		//成员内部类的创建
		Inner i = new Inner();
		
		return i;
	}
	

}
