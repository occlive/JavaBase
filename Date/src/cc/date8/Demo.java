package cc.date8;

import java.time.Instant;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ʱ���
		//��̬�ࡢ�ڲ���
		//��ȷ�����룬ʱ����뱱��ʱ�����8��ʱ��
		Instant i = Instant.now().plusMillis(TimeUnit.HOURS.toMillis(8));
		System.out.println(i.toString());
		//ͨ�����������ʵ��
		Instant i2 = Instant.ofEpochMilli(new Date().getTime()).plusMillis(TimeUnit.HOURS.toMillis(8));
		System.out.println(i2.toString());
		
		
		System.out.println("������������������������������������������������");
		
		//ת��Date
		//from ��̬����
		Date d = Date.from(i.minusMillis(TimeUnit.HOURS.toMillis(8)));
		System.out.println(d.toString());
		
		//toInstant����
		i = d.toInstant();
		System.out.println(i.toString());
		

	}

}
