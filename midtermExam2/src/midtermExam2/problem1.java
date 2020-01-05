package midtermExam2;

public class problem1 {

	public static void main(String[] args) {

		System.out.println("整数を10回入力してください");
		double num1 = new java.util.Scanner(System.in).nextDouble();
		double num2 = new java.util.Scanner(System.in).nextDouble();
		double num3 = new java.util.Scanner(System.in).nextDouble();
		double num4 = new java.util.Scanner(System.in).nextDouble();
		double num5 = new java.util.Scanner(System.in).nextDouble();
		double num6 = new java.util.Scanner(System.in).nextDouble();
		double num7 = new java.util.Scanner(System.in).nextDouble();
		double num8 = new java.util.Scanner(System.in).nextDouble();
		double num9 = new java.util.Scanner(System.in).nextDouble();
		double num10 = new java.util.Scanner(System.in).nextDouble();

		double sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;

		System.out.println("");
		System.out.println("平均値は" + Math.round(sum / 10));
	}
}