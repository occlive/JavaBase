package cc.string;

import java.util.StringTokenizer;

//StringTokenizer
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ַ����Զ����Ϊ�磬����Ϊһ����������token
		//������split
		String str = "hello~my~name~is~occlive";
		StringTokenizer strTok = new StringTokenizer(str,"~");
		while(strTok.hasMoreTokens()) {
			System.out.print(strTok.nextToken()+" ");
		}
		
		

	}

}
