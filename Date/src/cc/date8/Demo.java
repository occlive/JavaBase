package cc.date8;

import java.time.Instant;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//时间戳
		//静态类、内部类
		//精确到纳秒，时间戳与北京时间相差8个时区
		Instant i = Instant.now().plusMillis(TimeUnit.HOURS.toMillis(8));
		System.out.println(i.toString());
		//通过毫秒数获得实例
		Instant i2 = Instant.ofEpochMilli(new Date().getTime()).plusMillis(TimeUnit.HOURS.toMillis(8));
		System.out.println(i2.toString());
		
		
		System.out.println("————————————————————————");
		
		//转换Date
		//from 静态方法
		Date d = Date.from(i.minusMillis(TimeUnit.HOURS.toMillis(8)));
		System.out.println(d.toString());
		
		//toInstant方法
		i = d.toInstant();
		System.out.println(i.toString());
		

	}

}
