package method;

public class Kadai3 {
	/*【想定結果】
	 * 三角形の面積
	 * 135.0
	 */
	public static void main(String[] args) {
		//【引数】底辺の長さと高さ
		System.out.println("三角形の面積");
		System.out.println(task3(135.0, 2.1));
	}
	//【戻り値】三角形の面積を求めて戻す
	public static double task3(double baseLength, double height) {
		double area = (Math.round(baseLength * height / 2));
		return area;
	}
}