
public class Point {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void info() {
		System.out.println("x = " + x + "\ty = " + y);
	}
	
	public void change(int i, int j) {
		int t = i;
		i = j;
		j = t;
		System.out.println("改更后:i = " + i + "\tj = " + j);

	}
	
	public void change(Point p) {
		int t = p.x;
		p.x = p.y;
		p.y = t;
		System.out.println("交换后:x = " + p.x + "\ty=" + p.y);

	}
}
