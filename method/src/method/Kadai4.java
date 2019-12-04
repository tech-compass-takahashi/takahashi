package method;

public class Kadai4 {
	/*ーーー①文字列のみ場合ーーーー
	 * 文字列1文字列2
	 *ーーー②整数のみの場合ーーーー
	 *数値の合計
	 *ーーー③少数の場合ーーー
	 *少数の合計
	 */
	public static void main(String[] args) {
		//引数の数は二つずつ
		System.out.println("ーーー①文字列のみ場合ーーーー");
		System.out.println(overload("いつも","お疲れ様です"));
		System.out.println("ーーー②整数のみの場合ーーーー");
		System.out.println(overload(1,2));
		System.out.println("ーーー③少数の場合ーーー");
		System.out.println(overload(1.0,2.0));
	}
	//戻り値【引数より変化
	public static String overload(String a, String b) {
		return a+b;
	}
	public static String overload(int a, int b) {
		return a+b+"";
	}
	public static String overload(double a,double b) {
		return a+b+"";
	}
}
