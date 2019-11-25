package loop;

public class Kadai3 {

	public static void main(String[] args) {
		// 数字入力を指示を表示
		System.out.print("数字を入力してください:");
		int num=new java.util.Scanner(System.in).nextInt();

		//整数を受けとり、その桁数を求める
		int num2=0;
		for(;num!=0;num2++) {
			num/=10;
		}
		//受け取った整数の桁を表示
		System.out.print("桁数:"+num2);
	}
}