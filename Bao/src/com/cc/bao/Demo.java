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
		System.out.println("Π的数值为：" + Math.PI);
		try {
			// 休眠1s
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// awt
		window();

		// applet
		//使用Java Applet启动

		// net
		netURL();
		
		// io
		getFile();

		// util
		getTime();

	}

	public static void window() {
		// 创建顶级窗口
		Frame f = new Frame();
		// 设置窗口的位置，大小
		f.setBounds(30, 30, 500, 400);
		// 将窗口显示出来
		f.setVisible(true);
	}
	
	public static void getTime() {
		Date date = new Date();
		System.out.println("当前时间为：" + date.toLocaleString());
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
