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
	LinkedList<Appt> testAppts = null;
	assertTrue(validCalday.getAppts() != testAppts);
	
	CalDay testCalday = new CalDay(Day2);
	assertTrue(validCalday.getMonth() == month + 1);
	assertTrue(validCalday.getAppts() != null);
	assertTrue(nonvalidCalday.getAppts() == null);
	String strValid = "";
	strValid = validCalday.toString();
	assertTrue(strValid != "");
	String strInvalid = nonvalidCalday.toString();
	assertTrue(validCalday.getSizeAppts() == 0);
	
	Appt appt0 = new Appt(10, 6, 9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
	
	
	int apptsSize = validCalday.getSizeAppts();
	assertTrue(appt0.getValid());
	validCalday.addAppt(appt0);
	int newSize = validCalday.getSizeAppts();
	assertTrue(newSize != apptsSize);
	
	Appt appt1 = new Appt(10, 6, 9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
	appt1.setValid();
	validCalday.addAppt(appt1);
	
	Appt appt2 = new Appt(10, 6, 9, 14, 2019, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
	assertTrue(appt2.getValid());
	validCalday.addAppt(appt2);
	
	int sizeValid = validCalday.getSizeAppts();
	//assertTrue(sizeValid == 0);
	
	//nonvalidCalday.setAppts(null);
	String InfoStr = "";
	InfoStr = validCalday.getFullInfomrationApp(validCalday);
	assertTrue(InfoStr != "");
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
