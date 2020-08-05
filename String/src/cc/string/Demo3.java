package cc.string;

//StringBuilder
//非线性安全
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 字符串变量
		// 值可修改
		// 非线性安全
		StringBuilder strbid = new StringBuilder("miomio");

		// 字符串连接
		// 直接改值，不必str = ...
		strbid.append(strbid);
		System.out.println(strbid);

		// 字符串删除
		strbid.delete(3, 6);
		System.out.println(strbid);

		// 字符串插入
		strbid.insert(3, "汪汪汪");
		System.out.println(strbid);

		// 字符串逆序
		strbid.reverse();
		System.out.println(strbid);

		// 转为String对象
		String str = strbid.toString();

	}

}
