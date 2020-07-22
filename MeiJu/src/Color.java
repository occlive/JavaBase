
public enum Color implements Type{
	//不能是数字
	//常量全大写
	//第一种表达
//	RED,GREEN,BLUE,YELLOW;
	//第二种表达
	RED("red color",0),GREEN("green color",1),BLUE("blue color",2),YELLOW("yellow color",3);

	@Override
	public void printColor() {
		// TODO Auto-generated method stub
		System.out.println("this color is " + this.getName() + "and id is " + this.id);
	}
	
	
	//构造方法
	
	Color(String str,int num){
		this.name = str;
		this.id = num;
	}
	
	
	//能提供GRT方法，不能提供set方法
	String name;
	int id;
	
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	
}	
