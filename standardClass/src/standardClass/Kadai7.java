package standardClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Kadai7 {

	public static void main(String[] args) {
		/* 現在日時:****年**月**日
		 * １週間後:****年**月**日
		 * １年後  :****年**月**日(曜日)
		 */

		Calendar calender = Calendar.getInstance();
		Calendar oneyearDay = Calendar.getInstance();

		SimpleDateFormat stringCalendar = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println("現在日時:" + stringCalendar.format(calender.getTime()));

		calender.add(Calendar.DAY_OF_MONTH, 7);
		System.out.println("１年後  :" + stringCalendar.format(calender.getTime()));

		oneyearDay.set(Calendar.YEAR, 2020);
		SimpleDateFormat string_oneyearDay = new SimpleDateFormat("yyyy年MM月dd日(E)");
		System.out.println("１年後  :" + string_oneyearDay.format(oneyearDay.getTime()));
	}
}