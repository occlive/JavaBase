package cc.object;

public class Methods3 {

	public void get(Short s1,Short s2) {
		System.out.println("Short,Short");
	}
	
	public void get(int s1,int s2) {
		System.out.println("int,int");
	}
	
	//可变参数列表
	
	public void get(short ...s1) {
		System.out.println("short...");
	}
}
