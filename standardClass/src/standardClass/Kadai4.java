package standardClass;

public class Kadai4 {

	public static void main(String[] args) {
		/*【想定結果】
		 *探したい文字:AY
		 *ABCDGOPQRSYZはAYを含まない
		 *
		 *探したい文字:AB
		 *ABCDGOPQRSYZはABを含む
		 *
		 *探したい文字:G
		 *ABCDGOPQRSYZはGを含む
		 */

		String str1 = "ABCDGOPQRSYZ";
		String str2 = "探したい文字:";
		String str3 = "を含まない";
		String str4 = "を含む";

		System.out.print(str2);
		String random1 = new java.util.Scanner(System.in).nextLine();
		if(str1.indexOf(random1) >= 0) {
			System.out.println(str1 + "は" + random1 + str4);
		}else {
			System.out.println(str1 + "は" + random1 + str3);
		}
	}
}