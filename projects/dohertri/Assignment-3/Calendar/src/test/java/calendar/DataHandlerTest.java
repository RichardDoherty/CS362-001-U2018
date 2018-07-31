
/** A JUnit test class to test the class DataHandler. */


package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import calendar.DataHandler;


import java.util.*;


public class DataHandlerTest{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
	  
	  Appt nonValidAppt = new Appt(-10, 30, 12, 2, 2017 ,"Appt","description","emailAddress");
	  nonValidAppt.setValid();
	 
	  Appt validAppt = new Appt(6, 30, 12, 2, 2017 ,"Appt","description","emailAddress");
	  validAppt.setValid();
	  
	  DataHandler data1 = new DataHandler();
	  DataHandler data2 = new DataHandler("Testfile.txt");
	  DataHandler data3 = new DataHandler("Testfile.txt", true);
	  DataHandler data4 = new DataHandler("Testfile.txt", false);
	  DataHandler data5 = new DataHandler("");
	  
	  GregorianCalendar Day1 = new GregorianCalendar(1990, 10, 5);
	  GregorianCalendar Day2 = new GregorianCalendar(2018, 12, 14);
	  data2.saveAppt(validAppt);
	  List<CalDay> lst1 = data2.getApptRange(Day1, Day2);   
	  List<CalDay> lst2 = null;
	  assertTrue(lst1 != lst2);
	  data2.saveAppt(nonValidAppt);
	  data2.deleteAppt(validAppt);
	  data2.deleteAppt(nonValidAppt);
	  List<CalDay> lst3 = data2.getApptRange(Day1, Day2);
	  assert(lst3 != lst1);
  }

}
