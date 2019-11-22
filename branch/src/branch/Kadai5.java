package branch;

public class Kadai5 {

	public static void main(String[] args) {
		// 整数を3つ入力してください
		System.out.println("好きな整数3つ入力してください。");
		int num1=new java.util.Scanner(System.in).nextInt();
		int num2=new java.util.Scanner(System.in).nextInt();
		int num3=new java.util.Scanner(System.in).nextInt();

		//入力した3つの整数の最大値を求める
		int max;
		max=num1;
		if(max<num2) {
			max=num2;
		}
		if(max<num3) {
			max=num3;
		}
		System.out.println("最大値:"+max);
	}

}
