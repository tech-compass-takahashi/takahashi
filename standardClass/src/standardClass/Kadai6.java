package standardClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Kadai6 {

	public static void main(String[] args) {
		/* ****年**月**日
		 * ****年**月**日**時**分
		 */

		Calendar cal = Calendar.getInstance();

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println(sdf1.format(cal.getTime()));

		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日HH時mm分");
		System.out.println(sdf2.format(cal.getTime()));
	}
}
