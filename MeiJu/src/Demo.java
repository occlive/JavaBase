
public class Demo {

	private Color color;//枚举Color类型
	
	
	public static void main(String args[]) {
		//获取枚举成员
		Color c0 = Color.RED; 
		Color c1 = Color.GREEN; 
		Color c2 = Color.BLUE; 
		Color c3 = Color.YELLOW;
		
		//返回枚举实例
		Color[] colors = Color.values();
		for(Color c:colors) {
			//自定义的打印方法，可以通过System.out来打印
			c.printColor();
			c.getId();
			c.getName();
		}
		
		System.out.println("----------------compareTo-----------------");
		//compareTo -左    +右
		int RedToYellow = Color.RED.compareTo(c3);
		System.out.println(RedToYellow);
		
		int BlueToRed =  Color.BLUE.compareTo(c0);
		System.out.println(BlueToRed);
		
		System.out.println("----------------equals-----------------");
		
		//equals
		boolean b0 = c0.equals(Color.RED);
		System.out.println(b0);
		boolean b1 = c0.equals(Color.GREEN);
		System.out.println(b1);
		
		
		System.out.println("----------------hashcode-----------------");
		//hashcode
		System.out.println(c0.hashCode());
		
		
		System.out.println("---------------ordinal------------------");
		//ordinal
		int index0 = c0.ordinal();
		System.out.println(index0);
		
		int index1 = c3.ordinal();
		System.out.println(index1);
		
		
		System.out.println("---------------name------------------");
		//name
		System.out.println(c0.name());
		System.out.println(c2.name());
		
		System.out.println("--------------toString-------------------");
		//toString
		System.out.println(c2.toString());
		
		System.out.println("--------------getclass-------------------");
		//getclass  只返回当前class
		System.out.println(c2.getClass());
		
		System.out.println("--------------getDeclaringClass-------------------");
		//getDeclaringClass  返回enum类的class
		System.out.println(c2.getDeclaringClass());
		
	}
}
