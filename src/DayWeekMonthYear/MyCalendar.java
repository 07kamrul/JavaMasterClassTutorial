package DayWeekMonthYear;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MyCalendar {
	private Calendar c;
	private List<String> output;

	public MyCalendar() {
		c = Calendar.getInstance();

		output = new ArrayList<String>();
	}

	public String getCalendar() {
		// Get current Day of week and Apply suitable offset to bring the new calendar
		// back to the appropriate Monday, i.e. this week or next

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

		switch (c.get(Calendar.DAY_OF_WEEK)) {

		case Calendar.SUNDAY:
			c.add(Calendar.DATE, 1);
			break;

		case Calendar.MONDAY:
			// Don't need to do anything on a Monday
			// included only for completeness

			break;

		case Calendar.TUESDAY:
			c.add(Calendar.DATE, -1);
			break;

		case Calendar.WEDNESDAY:
			c.add(Calendar.DATE, -2);
			break;

		case Calendar.THURSDAY:
			c.add(Calendar.DATE, -3);
			break;

		case Calendar.FRIDAY:
			c.add(Calendar.DATE, -4);
			break;

		case Calendar.SATURDAY:
			c.add(Calendar.DATE, 2);
			break;
		}

		// Add the Monday to the output
//		output.add(c.getTime().toString());
		output.add("\n" + formatter.format(c.getTime()));

		for (int x = 1; x <= 2; x++) {
			// Add the remaining days to the output
//			c.add(Calendar.DATE, 1);
//			output.add("\n" + c.getTime().toString());
//			
			c.add(Calendar.DATE, -1);

//			output.add("\n" + c.getTime());
//
			c.setTimeInMillis(c.getTimeInMillis());
			output.add(formatter.format(c.getTime()));

		}

//		System.out.println("------Output: " + output.get(2));

		return output.get(2);
	}
}
