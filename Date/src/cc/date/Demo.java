package cc.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
//日期类
import java.util.Date;

public class Demo {

	public static void main(String args[]) {

		// Date
		// 1.无参构造 本地当前时间
		Date d = new Date();
		// 2.参数 距离基准 1970.1.1.00:00:00 的毫秒
		Date d2 = new Date(10000000);

		// 日期的比较

		// getTime 获得毫秒值
		// 长整型数据
		// 进行比较
		System.out.println(d.getTime());
		System.out.println(d2.getTime());
		
		String result = d.getTime() > d2.getTime() ? "前者日期长" : "后者日期长";
		System.out.println(result);
		// after 是否在后
		System.out.println(d.after(d2));
		// before 是否在前
		System.out.println(d.before(d2));
		// compareTo
		/*
		 * 0 毫秒数相等 1 大于参数的毫秒数 在后 -1 小于参数的毫秒数 在前
		 */
		System.out.println(d.compareTo(d2));

		// equals
		/*
		 * true 毫秒数相同 false 毫秒数不同
		 */
		System.out.println(d.equals(d));

		// 不推荐使用的方法
		//
		/*
		 * getYear 年 1900开始计算 getMonth 月 0-11 getDate 日 getHours 时 getMinutes 分
		 * getSeconds 秒 getDay 星期 1，2，3，4，5，6，0(7)
		 */
		System.out.println("————————————————————————");
		System.out.println(
				(d.getYear() + 1900) + "年" + 
				(d.getMonth() + 1) + "月" + 
				d.getDate() + "日" + 
				d.getHours()+ "时" + 
				d.getMinutes() + "分" + 
				d.getSeconds() + "秒" + 
				" 星期" + (d.getDay() == 0 ? "日" : d.getDay()));
		/*
		 * toGMTString 返回GMT日期格式 toLocaleString 返回本地日期格式 toString 返回该格式的日期 dow mon dd
		 * hh:mm:ss zzz yyyy
		 */
		System.out.println(d.toGMTString());
		System.out.println(d.toLocaleString());
		System.out.println(d.toString());

		
		//与Calendar转换
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		
		System.out.println("————————————————————————");
		//格式化
		
		//DateFormat
		//抽象类
		/*
		 * DateFormat的常量参数
		 * SHORT
		 * MEDIUM
		 * LONG
		 * FULL
		 */
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		
		//format 格式化日期
		String date = df.format(d);
		System.out.println(date);
		//parse 解析字符串
		try {
			d = df.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date.toString());
		
		
		
		//SimpleDateFormat
		//具体类
		/*
		 * 参数
		 * y 年
		 * M 月
		 * d 日
		 * E 星期
		 * H 小时   0-23
		 * k 小时   1-24
		 * K 小时数  0-11
		 * h  小时数 1-12
		 * a 上下午
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd KK:mm:ss a E ");
		
		
		date = sdf.format(d);
		System.out.println(date);
		
		try {
			d = sdf.parse(date);
			System.out.println(d.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
