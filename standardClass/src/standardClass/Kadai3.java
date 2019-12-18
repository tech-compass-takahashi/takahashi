package standardClass;

public class Kadai3 {

	public static void main(String[] args) {
		/*【想定結果】
		 *文字列： ABCDEFG
		 *GFEDCBA:  列字文
		 */

		String text = "ABCDEFG";

		System.out.print("文字列: " + text);

		System.out.println();
		for(int i = text.length()-1; i >= 0; i--) {
			char endTxet = text.charAt(i);
			System.out.print(endTxet);
		}
		System.out.println(": 列字文");
	}
}