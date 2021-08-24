package DayWeekMonthYear;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormat {

	public static void main(String[] args) {
//		MyCalendar myc = new MyCalendar();

//		System.out.println(myc.getCalendar());

		Calendar cal = Calendar.getInstance();
//		cal.set(2021, 4, 15);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		int daysBackToSat = cal.get(Calendar.DAY_OF_WEEK) == 7 ? 0 : cal.get(Calendar.DAY_OF_WEEK);

		cal.add(Calendar.DATE, daysBackToSat * -1);

		System.out.println("Last Saturday: " + sdf.format(cal.getTime()));
	}

}
