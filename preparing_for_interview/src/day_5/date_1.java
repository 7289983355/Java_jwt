package day_5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class date_1 {

	public static void main(String[] args) throws ParseException, DatatypeConfigurationException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf =new  SimpleDateFormat("yyyy-MM-dd");
		
		String date ="1994-03-17";
	
			Date d= sdf.parse(date);	
	        GregorianCalendar gcal = new GregorianCalendar();
	        System.out.println(d);
	        gcal.setTime(d); 
	 
		        XMLGregorianCalendar xmlf=DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
		
		        System.out.println(xmlf);

	}

}
