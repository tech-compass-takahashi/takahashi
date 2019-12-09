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

		String str1 = "ABCDGOPQRSYZは";
		String str2 = "探したい文字:";
		String str3 = "を含まない";
		String str4 = "を含む";

		System.out.print(str2);
		String random1 = new java.util.Scanner(System.in).nextLine();
		if(str1.indexOf(random1) >= 0) {
			System.out.println(str1 + random1 + str4);
		}else {
			System.out.println(str1+random1 + str3);
		}
		System.out.println();

		System.out.print(str2);
		String random2 = new java.util.Scanner(System.in).nextLine();
		if(str1.indexOf(random2) >= 0) {
			System.out.println(str1 + random2 + str4);
		}else {
			System.out.println(str1 + random2 + str3);
		}
		System.out.println();

		System.out.print(str2);
		String random3 = new java.util.Scanner(System.in).nextLine();
		if(str1.indexOf(random3) >= 0) {
			System.out.println(str1 + random3 + str4);
		}else {
			System.out.println(str1 + random3 + str3);
		}
	}
}