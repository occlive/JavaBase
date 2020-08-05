package cc.string;


//字符串常量类
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//一经赋值，其值无法改变
//		私有的常量字符数组
		//所指向的内存值不可修改，但可以改变指向
		//初始化
		//1.构造方法   堆区
		String str = new String("喵喵喵");
		String str3 = new String("喵喵喵");
		//2.常量初始化  常量区
		String str2 = "喵喵喵";
		
		//地址比较
		boolean b;
		b = str==str2?true:false;
		System.out.println(b);
		
		//值相同，同一个区，地址不同
		b = str==str3?true:false;
		System.out.println(b);
		
		//值比较
		b = str.equals(str2);
		System.out.println(b);
		
		//字符串连接
		//1.concat
		str = str.concat(str);
		System.out.println(str);
		//2. +
		str2+=str2;
		System.out.println(str2);
		
		
		//字符串查找
		str2 = "abcdef";
		System.out.println(str2.indexOf("ab"));
		
		System.out.println(str2.lastIndexOf("ab"));
		
		System.out.println(str2.charAt(0));
		
		str2.startsWith(str, 0);
		
		//字符串分割
		str2 = "m,i,o,m,i,o,m,i,o";
		String[]  strArr = str2.split(",");
		for(String s:strArr) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		//字符串比较
		/*
		 * 将字符串与参数字符串进行字符比较
		 * 相同位置，字符相同则继续
		 * 不同则返回字符串字符减去参数字符串字符的差值
		 * 
		 * 如果之前值相同，但是长度不同，
		 * 返回字符串长度减去参数字符串长度的差值
		 */
		str = new String("aa");
		str2 = "aaaaa";
		int a = str.compareTo(str2);
		System.out.println(a);
		
		//忽略大小写的值比较
		str = new String("AbCdE");
		str2 = "abcde";
		b = str.equalsIgnoreCase(str2);
		System.out.println(b);
		
		//字符串替换
		str = new String("喵a喵a喵a");
		str = str.replace('a','~');
		System.out.println(str);
		
		//字符串求字串
		str = str.substring(0,2);
		System.out.println(str);
		
		//字符串大小写转换
		str2 = str2.toUpperCase();
		System.out.println(str2);
		
		str2 = str2.toLowerCase();
		System.out.println(str2);
		
		
	}

}
