
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

	//ʵ�ֽӿڵķ���
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("implements Parent methods add");
	}
	
	
	

}
