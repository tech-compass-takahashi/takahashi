package method;

public class Kadai2 {
	/*【想定結果】
	 * 私の名前はコラボです。
	 * 年齢は30歳です。
	 * 身長は178.0㎝です。
	 * よろしくお願いします。
	 */
	public static void main(String[] args) {
		task2("コラボ", 30, 178.0);
	}
	public static void task2(String name, int age, double height) {
		System.out.println("私の名前は" + name + "です。");
		System.out.println("年齢は" + age + "です。");
		System.out.println("身長は" + height + "㎝です。");
	}
}