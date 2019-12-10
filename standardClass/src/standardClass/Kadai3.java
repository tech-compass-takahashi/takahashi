package standardClass;

public class Kadai3 {

	public static void main(String[] args) {
		/*【想定結果】
		 *文字列： ABCDEFG
		 *GFEDCBA:  列字文
		 */

		String[] strArray = {"文", "字", "列", ": ",  "A", "B", "C", "D", "E", "F", "G"};
		for(int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i]);
		}

		System.out.println();
		for(int i = strArray.length-1; i >= 0; i--) {
			System.out.print(strArray[i]);
		}
	}
}