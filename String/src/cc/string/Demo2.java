package cc.string;

//StringBuffer
//线性安全
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//字符串变量类
		//值可修改
		
		StringBuffer strbuf = new StringBuffer("miomiomio");
		
		//字符串连接
		//直接改值，不必str = ...
		strbuf.append(strbuf);
		System.out.println(strbuf);
		
		//字符串删除
		strbuf.delete(3,6);
		System.out.println(strbuf);
		
		//字符串插入
		strbuf.insert(3, "汪汪汪");
		System.out.println(strbuf);
		
		//字符串逆序
		strbuf.reverse();
		System.out.println(strbuf);
		
		//转为String对象
		String str = strbuf.toString();
		
		
		
	}

}
