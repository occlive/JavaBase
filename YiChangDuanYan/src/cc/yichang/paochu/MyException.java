package cc.yichang.paochu;


//�Զ����쳣
public class MyException extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "MyException:��������~���쳣��Ŷ";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "��������~���쳣��Ŷ��������"+this.getClass().getName();
	}

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.out.println("��������~����ʧ����Ŷ���쳣������"+this.getClass().getName());
	}
	

}
