/** A JUnit test class to test the class ApptTest. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalendarUtil;

import java.util.*;


public class ApptTest  {
	
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(15, 30, 9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      appt0.setValid();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals(0, appt0.getRecurIncrement());
      assertEquals("Birthday Party",appt0.getTitle());
      assertTrue(!appt0.getValid());
      
      int[] recur = {4, 6};
  	  appt0.setRecurrence(recur, 4, 2, 6);
  	  assertEquals(appt0.getRecurNumber(), 6);
  	  assertEquals(appt0.getRecurBy(), 4);
  	  assertEquals(appt0.getRecurDays(), recur);
  	  assertEquals(appt0.getRecurIncrement(), 2);
  	  appt0.toString();
  }

@Test(timeout = 4000)
 public void test01()  throws Throwable  {
	int year = 2018;
	int month = 10;
	int day = 5;
	int hour = 11;
	int minute = 30;
	
	String title = "Appt Title";
	String description = "Appt Description";
	String emailAddress = "Email Address for Appt";

	
	Appt appt1 = new Appt(hour, minute, day, month,year,title,description,emailAddress);
	appt1.setValid();
	assertTrue(appt1.getValid());
	assertEquals(hour, appt1.getStartHour());
	assertEquals(month,appt1.getStartMonth());
	assertEquals(appt1.getStartMinute(), minute);
	assertEquals(appt1.getStartDay(), day);
	assertEquals(appt1.getStartYear(), year);
	assertEquals(appt1.getTitle(), title);
	assertEquals(appt1.getDescription(), description);
	assertEquals(appt1.getEmailAddress(),  emailAddress);

	appt1.setRecurrence(null, 1, 1, 1);
	appt1.getXmlElement();
	assertTrue(appt1.isOn(day, month, year));
	assertFalse(appt1.isOn(1,1,2000));
	assertFalse(appt1.isOn(day,1,2000));
	assertFalse(appt1.isOn(1,month,2000));
	assertFalse(appt1.isOn(1,1,year));
	appt1.hasTimeSet();
	
	//String printAppt = "\t" + month + "/"+ day +"/"+ year + " at " +  appt1.represntationApp()  + " ," +  title + ", "+  description+"\n";
	//assertEqual(appt1.represntationApp(), "11:30am");
	//assertEqual(appt1.toString(), "10/5/2018 at \t11:30am ,Appt Title, Appt Description\n");
	
}


@Test(timeout = 4000)
 public void test02() throws Throwable {
 	int year = 2018;
	int month = 10;
	int day = 5;
	String title = "Appt Title";
	String description = "Appt Description";
	String emailAddress = "Email Address for Appt";

	Appt appt2 = new Appt(day, month, year, title, description, emailAddress);
 }

@Test(timeout = 4000)
public void test03() throws Throwable {
	
	int month = 10;
	int day = 5;
	
	int year = 2018;
	int hour = 11;
	int minute = 30;
	
	int invalidYear = -5;
	
	int invalidHourHigh = 25;
	int invalidHourLow = -5;
	
	int invalidMinuteHigh = 61;
	int invalidMinuteLow = -5;
	
	int invalidDayHigh = 40;
	int invalidDayLow = -5;
	
	String title = null;
	String description = null;
	String emailAddress = "Email Address for Appt";

	
	Appt appt1 = new Appt(hour, minute, day, month, invalidYear,title,description,emailAddress);
	appt1.setValid();
	
	appt1.setRecurrence(null, 0, 0, 0);
	
	Appt appt20 = new Appt(-10, minute, day, month,year,title,description,emailAddress);
	appt20.setValid();
	Appt appt21 = new Appt(invalidHourHigh, minute, day, month,year,title,description,emailAddress);
	appt21.setValid();
	
	Appt appt30 = new Appt(hour, invalidMinuteLow, day, month,year,title,description,emailAddress);
	appt30.setValid();
	Appt appt31 = new Appt(hour, invalidMinuteHigh, day, month,year,title,description,emailAddress);
	appt31.setValid();

	Appt appt40 = new Appt(hour, minute, invalidDayLow, month,year,title,description,emailAddress);
	appt40.setValid();
	Appt appt41 = new Appt(hour, minute, invalidDayHigh, month,year,title,description,emailAddress);
	appt41.setValid();
	
  }
}


