package cc.date;

import java.util.Calendar;
import java.util.Date;

//Calendar类

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calendar是一个抽象类
		//获得实例
		Calendar c = Calendar.getInstance();
		
		//属性常量
		/*
		 * YEAR   年
		 * MONTH  月
		 * DATE   日
		 * HOUR   小时
		 * 
		 * DAY_OF_YEAR  当前年中的天数
		 * DAY_OF_MONTH  一个月中的某天
		 * DAY_OF_WEEK   一个星期中的某天
		 * DAY_OF_WEEK_IN_MONTH  指示当前月中的第几个星期
		 * 
		 * WEEK_OF_YEAR   当前年中的星期数
		 * WEEK_OF_MONTH  当前月中的星期数
		 * 
		 * 
		 * HOUR_OF_DAY  一天中的小时
		 * 
		 * AM_PM  指示 HOUR 是在中午之前还是在中午之后
		 * AM     午夜到中午
		 * PM     中午到午夜
		 */
		
		//set、get方法
		c.set(2020, 0, 1);
		
		System.out.println(
				c.get(Calendar.YEAR)+"年"+ 
				(c.get(Calendar.MONTH)+1)+"月"+
				c.get(Calendar.DATE)+"日"+
				c.get(Calendar.HOUR_OF_DAY)+"时"+
				(c.get(Calendar.DAY_OF_WEEK)==1?"星期日":"星期"+(c.get(Calendar.DAY_OF_WEEK)-1))			
			);
		//add 方法
		c.add(Calendar.MONTH, 7);
		System.out.println(c.getTime().toLocaleString());
		

		//与Date转换
		Date d = new Date();
		d = c.getTime();
	}

}
