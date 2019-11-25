package loop;

public class Kadai1 {

	public static void main(String[] args) {
		//数字入力の指示を表示
		System.out.print("数字を入力してください:");

		// 正の整数を受け取り１からその整数までを足した結果を求める
        int num1=new java.util.Scanner(System.in).nextInt();
        int sum=0;
		for(int i=1;i<=num1;i++) {
			sum+=i;
        }
		//１から受け取った正の整数までの合計を表示
		System.out.println("1～"+num1+"までの合計:"+sum);
	}

}
