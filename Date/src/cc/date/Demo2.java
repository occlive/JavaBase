package cc.date;

import java.util.Calendar;
import java.util.Date;

//Calendar��

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calendar��һ��������
		//���ʵ��
		Calendar c = Calendar.getInstance();
		
		//���Գ���
		/*
		 * YEAR   ��
		 * MONTH  ��
		 * DATE   ��
		 * HOUR   Сʱ
		 * 
		 * DAY_OF_YEAR  ��ǰ���е�����
		 * DAY_OF_MONTH  һ�����е�ĳ��
		 * DAY_OF_WEEK   һ�������е�ĳ��
		 * DAY_OF_WEEK_IN_MONTH  ָʾ��ǰ���еĵڼ�������
		 * 
		 * WEEK_OF_YEAR   ��ǰ���е�������
		 * WEEK_OF_MONTH  ��ǰ���е�������
		 * 
		 * 
		 * HOUR_OF_DAY  һ���е�Сʱ
		 * 
		 * AM_PM  ָʾ HOUR ��������֮ǰ����������֮��
		 * AM     ��ҹ������
		 * PM     ���絽��ҹ
		 */
		
		//set��get����
		c.set(2020, 0, 1);
		
		System.out.println(
				c.get(Calendar.YEAR)+"��"+ 
				(c.get(Calendar.MONTH)+1)+"��"+
				c.get(Calendar.DATE)+"��"+
				c.get(Calendar.HOUR_OF_DAY)+"ʱ"+
				(c.get(Calendar.DAY_OF_WEEK)==1?"������":"����"+(c.get(Calendar.DAY_OF_WEEK)-1))			
			);
		//add ����
		c.add(Calendar.MONTH, 7);
		System.out.println(c.getTime().toLocaleString());
		

		//��Dateת��
		Date d = new Date();
		d = c.getTime();
	}

}
