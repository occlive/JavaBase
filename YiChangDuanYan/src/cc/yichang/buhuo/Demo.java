package cc.yichang.buhuo;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo {
	
	/*
	 * ����Ѻõ���ʾ�û���
	 * try {//���ܷ����쳣�Ĵ����
			f.createNewFile();
			
		}
		catch(IOException e) {//�����쳣����Ĵ����
			e.printStackTrace();
			System.out.printfln("file create failed!");
		}
	 * ��ִ��try�����ݣ��������쳣��catch�鲻��ִ�У�ֱ��ִ��catch������ݡ�
	 * 
	 * try�����쳣���Ͳ���ִ�к�������ݣ�����catch����д���
	 * 
	 * һ��try����Ը����catch�飻ִ��һ��catch�飬���������catch�鲻ִ�С�
	 * 
	 * catch(Exception e){
	 * 		e.printStackTrace();
	 * }
	 *�κ��쳣�Ķ��󶼿ɱ��䲶��,Ӧ�÷����

	 */

	// �쳣����
	public static void main(String args[]) {

		File f = null;

		// try catch ���
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// �����쳣
		//1.�ֿ�
		try {
			f.createNewFile();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		//2.����
		try {

			f.createNewFile();

		} catch (IOException | RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		//��Դ����finally
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			//����ִ�д���䣬��Ȼfinally�ض�ִ��
//			System.exit(0);
			e.printStackTrace();
		} finally {
			f.delete();
		}
		
		//ע��
		//����ֻ��try
//		try {}
		//finally����try
		try {}finally {}
		
		
	}
	

}
