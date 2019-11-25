package loop;

public class Kadai3 {

	public static void main(String[] args) {
		// 数字入力を指示を表示
		System.out.print("数字を入力してください:");
		int num=new java.util.Scanner(System.in).nextInt();

		//整数を受けとり、その桁数を求める
		int num3=0;
		for(int num2=0;num2<=num;num2++) {
			num3=num2;//←桁数の計算方法が不明
		}
		//受け取った整数の桁を表示
		System.out.print("桁数:"+num3);
	}
}