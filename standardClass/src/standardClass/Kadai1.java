package standardClass;

public class Kadai1 {

	public static void main(String[] args) {
		/*【想定結果】
		 *変換前: tech-compas
		 *変換後:TECH-COMPASS
		 */

		String str1 = " tech-compass ";
		String str2 = str1.trim();
		System.out.println("変換前:" + str1);
		System.out.println("変換後:" + str2.toUpperCase());
	}
}