package cc.yichang.paochu;


//自定义异常
public class MyException extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "MyException:主人主人~出异常了哦";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "主人主人~出异常了哦，类型是"+this.getClass().getName();
	}

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.out.println("主人主人~程序失败了哦，异常类型是"+this.getClass().getName());
	}
	

}
