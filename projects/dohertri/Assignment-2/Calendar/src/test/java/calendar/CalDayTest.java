package calendar;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;

public class CalDayTest {
	
	/*Test Objects*/
	
	//Object calday
	
	int year = 2018;
	int month = 10;
	int day = 5;
	
	int hour = 12;
	int minute = 30;
	
	String title = "Appt Title";
	String description = "Appt Description";
	String emailAddress = "Email Address for Appt";

	GregorianCalendar Day = new GregorianCalendar(year, month, day);
	
	CalDay nonvalidCalday = new CalDay();
	CalDay validCalday = new CalDay(Day);
	Appt appt1 = new Appt(hour, minute, day, month, year, title, description, emailAddress);
	Appt appt2 = new Appt(day, month, year, title, description, emailAddress);
	LinkedList<Appt> nullAppt = null;
	
	 /*Test that the gets methods work as expected.*/
	 //addAppt
	 @Test
	  public void test01()  throws Throwable  {
		 
	 }
	 
	 //isValid
	 @Test
	  public void test02()  throws Throwable  {
		 
	 }
	 
	 //Iterator
	 @Test
	  public void test03()  throws Throwable  {
		 
	 }
	 
	 //setAppts
	 @Test
	  public void test04()  throws Throwable  {
		 
	 }
	 
	 //setDay
	 @Test
	  public void test05()  throws Throwable  {
		 
	 }
	 
	 //setMonth
	 @Test
	  public void test06()  throws Throwable  {
		 
	 }
	
	 //setYear
	 @Test
	  public void test07()  throws Throwable  {
		 
	 }
	
	 //setYear
	 @Test
	  public void test08()  throws Throwable  {
		 
	 }
	 
	 //getAppts
	 @Test
	  public void test09()  throws Throwable  {
		 
	 }
	 
	 //getSizeAppts
	 @Test
	  public void test10()  throws Throwable  {
		 
	 }
	 
	 //getDay
	 @Test
	  public void test11()  throws Throwable  {
		 
	 }
	
	 //getMonth
	 @Test
	  public void test12()  throws Throwable  {
		 
	 }
	 
	 //toString
	 @Test
	  public void test13()  throws Throwable  {
		 
	 }
	 
	 //getFullInformation
	 @Test
	  public void test14()  throws Throwable  {
		 
	 }
}

