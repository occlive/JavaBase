package cc.date8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

//LocalDate

//LocalTime

//LocalDateTime
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ֻ���ꡢ�¡���
		/*
		 * now
		 * of
		 * parse 
		 */
		LocalDate ld = LocalDate.now();
		System.out.println(ld.toString());

		//with ����
		// ���µ�һ��
		LocalDate ld2 = ld.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println(ld2.toString());

		//withDayOfMonth����
		// ���µڶ���
		ld2 = ld.withDayOfMonth(2);
		System.out.println(ld2.toString());

		// �������һ��
		ld2 = ld.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(ld2.toString());

		//���
		ld = LocalDate.of(2020, 1, 1).with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println(ld.toString());

		System.out.println("����������������������������������������");
		// ֻ��ʱ���֡���
		/*
		 * now
		 * of
		 * parse 
		 */
		LocalTime lt = LocalTime.now();
		System.out.println(lt.toString());
		
		/*
		 * getHour
		 * getMinute
		 * getSecond
		 * 
		 */
		System.out.println(lt.getHour());
		System.out.println(lt.getMinute());
		System.out.println(lt.getSecond());
		
		System.out.println("����������������������������������������");
		
		/*
		 * now
		 * of
		 * parse 
		 */
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt.toString());

		//toLocalDate
		ld = ldt.toLocalDate();
		//toLocalTime
		lt = ldt.toLocalTime();
		System.out.println(ld.toString()+lt.toString());
		
	}

}
