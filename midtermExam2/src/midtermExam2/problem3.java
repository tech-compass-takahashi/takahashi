package midtermExam2;

public class problem3 {

	public static void main(String[] args) {

		System.out.print("x=");
		int x = new java.util.Scanner(System.in).nextInt();

		System.out.print("y=");
		int y = new java.util.Scanner(System.in).nextInt();

		if(x > y) {
			String textX =  methodX();
			System.out.println(textX);
		}else {
			String textY =  methodY();
			System.out.println(textY);
		}
	}

	public static String methodX() {
		return "xの方が大きい";
	}

	public static String methodY() {
		return "yの方が大きい";
	}
}