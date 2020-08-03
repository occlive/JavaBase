package cc.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
//������
import java.util.Date;

public class Demo {

	public static void main(String args[]) {

		// Date
		// 1.�޲ι��� ���ص�ǰʱ��
		Date d = new Date();
		// 2.���� �����׼ 1970.1.1.00:00:00 �ĺ���
		Date d2 = new Date(10000000);

		// ���ڵıȽ�

		// getTime ��ú���ֵ
		// ����������
		// ���бȽ�
		System.out.println(d.getTime());
		System.out.println(d2.getTime());
		
		String result = d.getTime() > d2.getTime() ? "ǰ�����ڳ�" : "�������ڳ�";
		System.out.println(result);
		// after �Ƿ��ں�
		System.out.println(d.after(d2));
		// before �Ƿ���ǰ
		System.out.println(d.before(d2));
		// compareTo
		/*
		 * 0 ��������� 1 ���ڲ����ĺ����� �ں� -1 С�ڲ����ĺ����� ��ǰ
		 */
		System.out.println(d.compareTo(d2));

		// equals
		/*
		 * true ��������ͬ false ��������ͬ
		 */
		System.out.println(d.equals(d));

		// ���Ƽ�ʹ�õķ���
		//
		/*
		 * getYear �� 1900��ʼ���� getMonth �� 0-11 getDate �� getHours ʱ getMinutes ��
		 * getSeconds �� getDay ���� 1��2��3��4��5��6��0(7)
		 */
		System.out.println("������������������������������������������������");
		System.out.println(
				(d.getYear() + 1900) + "��" + 
				(d.getMonth() + 1) + "��" + 
				d.getDate() + "��" + 
				d.getHours()+ "ʱ" + 
				d.getMinutes() + "��" + 
				d.getSeconds() + "��" + 
				" ����" + (d.getDay() == 0 ? "��" : d.getDay()));
		/*
		 * toGMTString ����GMT���ڸ�ʽ toLocaleString ���ر������ڸ�ʽ toString ���ظø�ʽ������ dow mon dd
		 * hh:mm:ss zzz yyyy
		 */
		System.out.println(d.toGMTString());
		System.out.println(d.toLocaleString());
		System.out.println(d.toString());

		
		//��Calendarת��
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		
		System.out.println("������������������������������������������������");
		//��ʽ��
		
		//DateFormat
		//������
		/*
		 * DateFormat�ĳ�������
		 * SHORT
		 * MEDIUM
		 * LONG
		 * FULL
		 */
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		
		//format ��ʽ������
		String date = df.format(d);
		System.out.println(date);
		//parse �����ַ���
		try {
			d = df.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date.toString());
		
		
		
		//SimpleDateFormat
		//������
		/*
		 * ����
		 * y ��
		 * M ��
		 * d ��
		 * E ����
		 * H Сʱ   0-23
		 * k Сʱ   1-24
		 * K Сʱ��  0-11
		 * h  Сʱ�� 1-12
		 * a ������
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
