package standardClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Practice {

	public static void main(String[] args) throws Exception {

		Calendar cal2 = Calendar.getInstance();
		cal2.set(Calendar.YEAR,2020);
		Date d = cal2.getTime();
		//System.out.println(d);

		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日(E)");
		String s =f.format(d);
		System.out.println(s);
	}
}