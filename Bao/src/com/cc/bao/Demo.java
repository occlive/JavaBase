package com.cc.bao;

import java.lang.*;
import java.awt.*;
import java.applet.*;
import java.net.*;
import java.io.*;
import java.util.*;

public class Demo extends Applet{

	public static void main(String args[]) {
		// lang
		String str = "hello world!";
		System.out.println("������ֵΪ��" + Math.PI);
		try {
			// ����1s
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// awt
		window();

		// applet
		//ʹ��Java Applet����

		// net
		netURL();
		
		// io
		getFile();

		// util
		getTime();

	}

	public static void window() {
		// ������������
		Frame f = new Frame();
		// ���ô��ڵ�λ�ã���С
		f.setBounds(30, 30, 500, 400);
		// ��������ʾ����
		f.setVisible(true);
	}
	
	public static void getTime() {
		Date date = new Date();
		System.out.println("��ǰʱ��Ϊ��" + date.toLocaleString());
	}
	
	public static void netURL() {
		URI uri;
		try {
			uri = new URI("http://java.sun.com/");
			URL url = uri.toURL();
			System.out.println("net:" + url);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void getFile() {
		File f = new File("");
		
	}
	
	public void paint(Graphics g) {
		g.drawString("Hello World", 20, 50);
	}
	
	
	
}
