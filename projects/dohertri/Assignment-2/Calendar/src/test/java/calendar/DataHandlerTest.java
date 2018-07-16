package calendar;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class DataHandlerTest {
	int yearA = 2018;
	int monthA = 10;
	int dayA = 5;
	
	int yearB = 2018;
	int monthB = 12;
	int dayB = 20;
	
	int hour = 12;
	int minute = 30;
	
	String title = "Appt Title";
	String description = "Appt Description";
	String emailAddress = "Email Address for Appt";
	
	GregorianCalendar day1 = new GregorianCalendar(yearA, monthA, dayA);
	GregorianCalendar day2 = new GregorianCalendar(yearB, monthB, dayB);
	
	CalDay nonvalidCalday = new CalDay();
	CalDay validCalday = new CalDay(day1);
	//Appt appt1 = Appt(hour, minute, dayA, monthA, yearA, title, description, emailAddress);
	//Appt appt2 = Appt(dayB, monthB, yearB, title, description, emailAddress);
	LinkedList<Appt> nullAppt = null;

	/*Test that the gets methods work as expected.*/
	 @Test
	  public void test01()  throws Throwable  {
	 
	 }

	 @Test
	  public void test02()  throws Throwable  {
		 
	 }	

}
