package method;

public class Kadai2 {
	/*【想定結果】
	 * 私の名前はコラボです。
	 * 年齢は30歳です。
	 * 身長は178.0㎝です。
	 * よろしくお願いします。
	 */
	public static void main(String[] args) {
		//引数
		task2("コラボ");
		int age=30;
		task2(age);
		double height=178.0;
		task2(height);
	}
	//メソッドの定義
	public static void task2(String name) {
		System.out.println("私の名前は"+name+"です。");
	}
	public static void task2(int age) {
		System.out.println("年齢は"+age+"歳です。");
	}
	public static void task2(double height) {
		System.out.println("身長は"+height+"㎝です。");
	}
}