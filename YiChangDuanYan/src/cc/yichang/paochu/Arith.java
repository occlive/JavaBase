package cc.yichang.paochu;

import java.io.File;
import java.io.IOException;

//�׳��쳣
public class Arith {

	//throws �����׳����쳣������������ʾ
	//throw һ���׳����쳣
	public void div(int s1,int s2) throws ArithmeticException {
		if(s2 == 0) {
			throw new ArithmeticException();
		}
		System.out.println("ARITH GOOD METHOD");
		
	}
	
	public void get(boolean b) throws MyException {
		if(!b) {
			throw new MyException();
		}
		System.out.println("ִ�����");
		
	}

}
