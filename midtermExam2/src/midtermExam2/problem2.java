package midtermExam2;

public class problem2 {

	public static void main(String[] args) {

		System.out.println("1か0を入力してください");
		int num1 = new java.util.Scanner(System.in).nextInt();
		int num2 = new java.util.Scanner(System.in).nextInt();
		int num3 = new java.util.Scanner(System.in).nextInt();
		int num4 = new java.util.Scanner(System.in).nextInt();
		int num5 = new java.util.Scanner(System.in).nextInt();
		int num6 = new java.util.Scanner(System.in).nextInt();
		int num7 = new java.util.Scanner(System.in).nextInt();
		int num8 = new java.util.Scanner(System.in).nextInt();
		int num9 = new java.util.Scanner(System.in).nextInt();
		int num10 = new java.util.Scanner(System.in).nextInt();

		int winCount = 0;
		int losingCount = 0;

		int array [] = {num1, num2, num3, num4, num5, num6, num7, num8, num9, num10};
		for(int i = 0; i < array.length; i++ ) {
			if(array[i] == 1) {
				++ winCount;
			}else{
				++ losingCount;
			}
		}

		System.out.println("");
		System.out.println("勝ちの総数は" + winCount);
		System.out.println("負けの総数は" + losingCount);
	}
}