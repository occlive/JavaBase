
public enum Color implements Type{
	//����������
	//����ȫ��д
	//��һ�ֱ��
//	RED,GREEN,BLUE,YELLOW;
	//�ڶ��ֱ��
	RED("red color",0),GREEN("green color",1),BLUE("blue color",2),YELLOW("yellow color",3);

	@Override
	public void printColor() {
		// TODO Auto-generated method stub
		System.out.println("this color is " + this.getName() + "and id is " + this.id);
	}
	
	
	//���췽��
	
	Color(String str,int num){
		this.name = str;
		this.id = num;
	}
	
	
	//���ṩGRT�����������ṩset����
	String name;
	int id;
	
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	
}	
