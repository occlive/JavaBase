package cc.yichang.paochu;

import java.io.File;
import java.io.IOException;

//抛出异常
public class Arith {

	//throws 可能抛出的异常，给调用者明示
	//throw 一定抛出的异常
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
		System.out.println("执行完成");
		
	}

}
