package DayWeekMonthYear;

import static java.time.DayOfWeek.SATURDAY;
import static java.time.temporal.TemporalAdjusters.firstDayOfMonth;
import static java.time.temporal.TemporalAdjusters.firstDayOfYear;
import static java.time.temporal.TemporalAdjusters.next;
import static java.time.temporal.TemporalAdjusters.previous;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;

public class DateMonthYear {

	public static void main(String[] args) throws java.lang.Exception {
		LocalDate sqlDate = LocalDate.now();

		System.out.println("Today : " + LocalDate.now());
		System.out.println("This Saturday : " + LocalDate.now().with(DayOfWeek.SATURDAY));
		System.out.println("Next sunday : " + LocalDate.now().with(next(SATURDAY)));
		System.out.println("Previous sunday : " + LocalDate.now().with(previous(SATURDAY)));
		System.out.println("First day of month : " + LocalDate.now().with(firstDayOfMonth()));
		System.out.println("First day of year : " + LocalDate.now().with(firstDayOfYear()));

		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		System.out.println("Date " + c.getTime());

		System.out.println("First day of week : " + c.getFirstDayOfWeek());

		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime().toString());

	}

}
