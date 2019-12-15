package standardClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Kadai7 {

	public static void main(String[] args) {
		/* 現在日時:****年**月**日
		 * １週間後:****年**月**日
		 * １年後  :****年**月**日(曜日)
		 */

		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println("現在日時:" + sdf1.format(cal1.getTime()));

		cal1.add(Calendar.DAY_OF_MONTH, 7);
		Date d1 = cal1.getTime();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
		String strTime1 = sdf2.format(d1);
		System.out.println("１年後  :" + strTime1);

		cal2.set(Calendar.YEAR, 2020);
		Date d2 = cal2.getTime();
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日(E)");
		String strTime2 = sdf3.format(d2);
		System.out.println("１年後  :" + strTime2);
	}
}