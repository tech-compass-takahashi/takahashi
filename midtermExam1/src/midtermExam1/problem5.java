package midtermExam1;

public class problem5 {

	public static void main(String[] args) {

		System.out.print("中間テストの点数を入力してください→");
		int IntermediateTest = new java.util.Scanner(System.in).nextInt();

		System.out.print("期末テストの点数を入力してください→");
		int term_endExam = new java.util.Scanner(System.in).nextInt();

		int total = IntermediateTest + term_endExam;

		if(60 >= IntermediateTest && term_endExam >= 60) {
			System.out.println("合格");
		}else if(total >= 130) {
			System.out.println("合格");
		}else if(total >= 100 && (IntermediateTest >= 90 || term_endExam >= 90)) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
	}
}