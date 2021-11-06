package vermeg_oca.chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeMain {

	public static void main(String[] args) {
		// 1-Creating
		
		/*LocalDate ld = LocalDate.now();
		System.out.println(ld);
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);*/
		//LocalDate ld = LocalDate.of(2021, 11, 5);
		/*
		LocalDate ld = LocalDate.of(2021,Month.APRIL, 30);
		System.out.println(ld);
		
		LocalTime lt = LocalTime.of(10,15);
		System.out.println(lt);
		
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		System.out.println(ldt);*/
		// 2-Manipulating
		/*LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(date); // 2014-01-20
		System.out.println(date.plusDays(2));
		System.out.println(date);
		date = date.plusDays(2);*/
		/*
		LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(date2, time).minusDays(1).minusHours(10).minusSeconds(30); 
		System.out.println(dateTime);*/
		// 3-Formatting
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		//date.getDayOfWeek();
		//System.out.println(date.getDayOfWeek());
		//System.out.println(date); 
		//DateTimeFormatter fs = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		//DateTimeFormatter fm = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		//System.out.println(date.format(fs)); 
		//System.out.println(date.format(fm)); 
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		
		LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(date2, time); 
		System.out.println(dateTime);
		System.out.println(f.format(dateTime));
		System.out.println(dateTime.format(f));
	}

}
