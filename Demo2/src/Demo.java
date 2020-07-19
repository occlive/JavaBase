public class Demo {
	public static void main(String[] args) {

		// 标识符

		// Syntax error
		/*
		 * 不能是关键字 不能数字开头 不能用数字、字母、下划线、$以外的字符 不能是保留字
		 */
//		int int = 1;	
//		String 123ww = "qwe";
//		long #abc = 123;
//		int const = 100;

		// Syntax right
		// 基本类型
		// 整数
		byte bt = 1;
		short st = 2;
		int len = 10;
		long lon = 100L;

		// 浮点
		// float类型的值后要加f
		float f = 10.0f;
		double d = 100.0;

		// 字符
//		char字符用单引号修饰
		char ch = 'a';

		// 布尔
		boolean b = true;

		// 引用类型
		// 数组
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		// 类
		// 自己定义的
		Number num = new Number();
		// 接口
		// Number实现Parent接口的add方法
		num.add();
		// 引用
		Type t = Type.CITE;
		
		System.out.println("———————————out———————————————");

		// 变量的操作
		int m = 10;
		int n = 5;
		int s;
		s = m+n;
		// System.out标准输出设备
		// 1.println 输出打印换行
		System.out.println(m);
		// 2.print 输出打印不换行
		System.out.print(n);
		// 3.printf 必须要用参数，且不换行 
		System.out.printf("%d",s);
		
		
		System.out.println("");
		System.out.println("————————————算数运算符——————————————");
		
//		算数运算符	
		s = m + n;
		System.out.println(m+"+"+n+"="+s);
		s = m - n;
		System.out.println(m+"-"+n+"="+s);
		s = m * n;
		System.out.println(m+"*"+n+"="+s);
		s = m / n;
		System.out.println(m+"/"+n+"="+s);
		s = m % n;
		System.out.println(m+"%"+n+"="+s);
		
		System.out.println("————————————自增运算符——————————————");
//		自增运算符
		System.out.println("10++="+ 11 );
		System.out.println("++10="+ 11 );
		
		//++m,m++的区别		
		System.out.println("在当前表达式中m=10,m++="+ m++);
		m-=1;
		System.out.println("在当前表达式中m=10,++m="+ ++m);
		
		System.out.println("————————————自减运算符——————————————");
//		自减运算符
		System.out.println("5--="+ 4 );
		System.out.println("--5="+ 4 );
		
		//--n,n--的区别		
		System.out.println("在当前表达式中n=5,n--="+ n--);
		n+=1;
		System.out.println("在当前表达式中n=5,--n="+ --n);
		
		System.out.println("————————————关系运算符——————————————");
//		关系运算符	
		
		if(m>=n) {
			System.out.println(m+">="+n);
		}else {
			System.out.println(m+"<"+n);
		}
		
		
		
		System.out.println("————————————逻辑运算符——————————————");
//		逻辑运算符	

		if(1==1 && m >= n) {
			System.out.println(m+">="+n);
		}else if(2>6 || 0!=0) {
			System.out.println("不可能打印");
		}else if(!true){
			System.out.println("不可能打印");
		}else {
			System.out.println("保底");
		}
		
		
		System.out.println("————————————三元运算符——————————————");
//		三元运算符
		
		s = m >= n?m:n;
		System.out.println(s +"=="+ m+">="+n+"?"+m+":"+n+";");
		
		System.out.println("————————————赋值运算符——————————————");
//		赋值运算符	
		s = m + n;
		System.out.println(s+"=="+m+"+"+n);
		
		s = m;
		s+=1;
		System.out.println(s+"=="+m+"+=1");
		s = m;
		s-=1;
		System.out.println(s+"=="+m+"-=1");
		
		s = n;
		s*=2;
		System.out.println(s+"=="+n+"*=2");
		
		s = n;
		s%=2;
		System.out.println(s+"=="+n+"%=2");
		
		System.out.println("————————————位运算符——————————————");
//		位运算符
		boolean b1 = true;
		boolean b2 = false;
		boolean b3;
		
		b3 = b1 & b2;
		System.out.println(b1+"&"+b2+"="+b3);
		b3 = b1 | b2;
		System.out.println(b1+"|"+b2+"="+b3);
		b3 = b1^b2;
		System.out.println(b1+"^"+b2+"="+b3);
		
		System.out.println("————————————字符串连接运算符——————————————");
//		字符串连接运算符
		String str1 = "i ";
		String str2 = "love ";
		String str3 = "u";
		str1 = str1 + str2 + str3;
		System.out.println(str1);
		
		System.out.println("————————————instanceof比较——————————————");
//		instanceof比较
		
		//Parent作为接口，引用类型
		//Number是Parent接口的实现类
		//num是Number类的实例化
		boolean bl = num instanceof Parent;
		System.out.println(bl);
		


	}
}
