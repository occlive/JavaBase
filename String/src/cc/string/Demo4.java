package cc.string;

import java.util.StringTokenizer;

//StringTokenizer
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//将字符串以定界符为界，分析为一个个独立的token
		//类似于split
		String str = "hello~my~name~is~occlive";
		StringTokenizer strTok = new StringTokenizer(str,"~");
		while(strTok.hasMoreTokens()) {
			System.out.print(strTok.nextToken()+" ");
		}
		
		

	}

}
