package loop;

public class Kadai4 {

	public static void main(String[] args) {
		// 正の整数入力を指示を表示
		System.out.print("正の整数を入力してください:");

		//受け取った正の整数の約数を求める
		int num=new java.util.Scanner(System.in).nextInt();
		System.out.print(num+"の約数:");
		for(int num2=1;num2<=num;num2++) {
			if(num%num2==0){
				System.out.print(num2);
			}
			if(num%num2==0) {
				System.out.print(",");
			}
		}
	}

}