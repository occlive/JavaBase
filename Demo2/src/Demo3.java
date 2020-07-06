
public class Demo3 {
	public class Demo
	{
		//更改这两个变量的值
		public void change(int i,int j)
		{
			int t = i;
			i = j;
			j = t;
			System.out.println("改更后:i = "+ i +"\tj = "+j);
			
		}
		public void change(Point p)
		{
			int t = p.x;
			p.x = p.y;
			p.y = t;
			System.out.println("交换后:x = "+ p.x + "\ty=" + p.y);
			
		}
		public void main(String args[])
		{  
		    int a=10,b=20;
			change(a,b);//方法传参，传的是实参副本，不是实参本身
			System.out.println("a = " + a + "\tb = "+b);
			
			System.out.println("---------------------------------");
			
			Point p=new Point(60,80);
			p.info();
			change(p);
			p.info();  
		}
	}
	class Point
	{
		int x;
		int y;
		public Point(int x,int y)
		{
			this.x = x;
			this.y = y;
		}
		
		public void info()
		{
			System.out.println("x = "+x+"\ty = "+y);
		}
		
	}

}
