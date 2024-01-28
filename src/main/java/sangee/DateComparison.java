package sangee;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateComparison {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
			int month=0;
			Date date1=sdf.parse("2023-12-23");
			Date date2=sdf.parse("2023-12-23");
			System.out.println(date1);
			System.out.println(sdf.format(date1));
			if(date1.compareTo(date2)==0) {
				System.out.println("Both dates are equal");
			}
			else if(date1.compareTo(date2)>0) {
				System.out.println("date1 is after date2");
			}
			else{
				System.out.println("date1 is  before date2");
			}
	
			Calendar cal = Calendar.getInstance();
		    cal.set(Calendar.MONTH, month);
		    month= cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		    System.out.println(month);
	}

}
