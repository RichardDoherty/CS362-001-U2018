/** A JUnit test class to test the class CalDay. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import java.util.*;


public class CalDayTest{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
	
	int year = 2018;
	int month = 10;
	int day = 5;
	
	int hour = 12;
	int minute = 30;
	
	String title = "Appt Title";
	String description = "Appt Description";
	String emailAddress = "Email Address for Appt";

	GregorianCalendar Day = new GregorianCalendar(year, month, day);
	GregorianCalendar Day2 = new GregorianCalendar(2018, 11, 20);
	CalDay nonvalidCalday = new CalDay();
	CalDay validCalday = new CalDay(Day);
	CalDay testCalday = new CalDay(Day2);
	
	assertTrue(validCalday.getAppts() != null);
	assertTrue(nonvalidCalday.getAppts() == null);
	
	assertTrue(validCalday.getSizeAppts() == 0);
	
	Appt appt0 = new Appt(15, 30, 9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
	appt0.setValid();
	validCalday.addAppt(appt0);
	int size = validCalday.getSizeAppts();
	assertTrue(size == 0);
	
	assertTrue(validCalday.isValid());
	assertFalse(nonvalidCalday.isValid());
	
	assertEquals(validCalday.getDay(), day);
	assertEquals(validCalday.getYear(), year);
	
	assertTrue(validCalday.iterator() != null);
	assertTrue(nonvalidCalday.iterator() == null);
	
	validCalday.toString();
	
	
	/* Cannot find the right call to the getFullInformation method
	 * Object testObject = new Object();
	String testString = validCalday.getFullInformationApp(testObject);*/
	
  }
 

}
