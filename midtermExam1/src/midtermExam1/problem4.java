package midtermExam1;

public class problem4 {

	public static void main(String[] args) {

		System.out.print("月を表す数値を入力してください→");
		int month = new java.util.Scanner(System.in).nextInt();

		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(month + "月の日数は31日となります。");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(month + "月の日数は30日となります。");
				break;
			case 2:
				System.out.println(month + "月の日数は28日となります。");
				break;
			default:
				System.out.println("1～12の数字を入力してください。");
				break;
		}
	}
}