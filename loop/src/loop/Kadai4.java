package loop;

public class Kadai4 {

	public static void main(String[] args) {
		// 正の整数入力を指示を表示
		System.out.print("正の整数を入力してください:");

		//受け取った正の整数の約数を求める
		int num=new java.util.Scanner(System.in).nextInt();
		int num3=0;
		for(int num2=0;num2<=num;num2++) {
			num3=num2;//←約数の計算方法
		}
        //受け取った正の整数の約数を表示する
		System.out.println(num+"の約数"+num3);
	}

}