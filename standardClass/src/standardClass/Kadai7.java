package standardClass;

import java.util.Calendar;

public class Kadai7 {

	public static void main(String[] args) {
		/* 現在日時:****年**月**日
		 * １週間後:****年**月**日
		 * １年後  :****年**月**日(曜日)
		 */

		Calendar cal1=Calendar.getInstance();
		Calendar cal2=Calendar.getInstance();

		System.out.print("現在日時:");
		System.out.print(cal1.get(Calendar.YEAR)+"年");
		System.out.print(cal1.get(Calendar.MONTH)+1+"月");
		System.out.println(cal1.get(Calendar.DAY_OF_MONTH)+"日");

		cal1.add(Calendar.DAY_OF_MONTH,+7);
		System.out.print("１週間後:");
		System.out.print(cal1.get(Calendar.YEAR)+"年");
		System.out.print(cal1.get(Calendar.MONTH)+1+"月");
		System.out.println(cal1.get(Calendar.DAY_OF_MONTH)+"日");

		cal2.set(Calendar.YEAR,2020);
		System.out.print("１年後  :");
		System.out.print(cal2.getTime());
	}
}