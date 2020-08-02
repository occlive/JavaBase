package cc.yichang.buhuo;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo {
	
	/*
	 * 如何友好的提示用户：
	 * try {//可能发生异常的代码块
			f.createNewFile();
			
		}
		catch(IOException e) {//发生异常后处理的代码块
			e.printStackTrace();
			System.out.printfln("file create failed!");
		}
	 * 先执行try块内容，不发生异常，catch块不被执行；直接执行catch后的内容。
	 * 
	 * try发生异常，就不会执行后面的内容；跳到catch块进行处理。
	 * 
	 * 一个try块可以跟多个catch块；执行一个catch块，后面的其他catch块不执行。
	 * 
	 * catch(Exception e){
	 * 		e.printStackTrace();
	 * }
	 *任何异常的对象都可被其捕获,应该放最后

	 */

	// 异常捕获
	public static void main(String args[]) {

		File f = null;

		// try catch 语句
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 多重异常
		//1.分开
		try {
			f.createNewFile();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		//2.叠加
		try {

			f.createNewFile();

		} catch (IOException | RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		//资源回收finally
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			//除非执行此语句，不然finally必定执行
//			System.exit(0);
			e.printStackTrace();
		} finally {
			f.delete();
		}
		
		//注意
		//不能只有try
//		try {}
		//finally跟进try
		try {}finally {}
		
		
	}
	

}
