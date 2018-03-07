package Lesson3_5;

import java.time.LocalDate;
import java.time.Month;

public class MyDate {
	public LocalDate date;

	public MyDate(LocalDate date) {
		
		this.date = date;
	}
	
	public MyDate(int year, int month, int day) {
		
		this.date = LocalDate.of(year, month, day);
	
	}
	
	public MyDate(int year, String month, int day) {
		
		this.date = LocalDate.of(year, Month.valueOf(month) , day);
	
	}
	
	public MyDate(int dayOfYear, int year) {
		
		
		this.date = LocalDate.ofYearDay(year, dayOfYear);
	
	}
	
	

}
