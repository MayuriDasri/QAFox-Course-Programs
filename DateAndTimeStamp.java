package QAFox_Practise;

import java.util.Date;

public class DateAndTimeStamp {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		String stringdate = date.toString();
		String newDate = stringdate.replace(" ","_").replace(":","_");
		System.out.println(newDate);
	}

}
