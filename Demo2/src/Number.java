
public class Number implements Parent{
	private int id;
	
	public Number() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//实现接口的方法
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("implements Parent methods add");
	}
	
	
	

}
