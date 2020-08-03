package cc.date8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//DateTimeFormatter
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//线程安全
		String date = "2020-08-04";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate ld = LocalDate.parse(date,dtf);
		
		System.out.println(ld.toString());
		
		
		LocalDateTime ldt = LocalDateTime.now();
		dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd KK:mm: a E");
		date = ldt.format(dtf);
		System.out.println(date);
	}

}
