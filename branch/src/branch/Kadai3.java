package branch;

public class Kadai3 {

	public static void main(String[] args) {
		// 正or負の整数もしくは0の3つから好きな数字を入力してください。
		System.out.println("好きな数字を入力してください");
		int num=new java.util.Scanner(System.in).nextInt();
		if(1<=num) {
			System.out.println("入力されたのは正の数です。");
		}
		if(-1>=num) {
			System.out.println("入力されたのは負の数です。");
		}
        if(0==num) {
        	System.out.println("入力されたのは0です。");
        }
    }
}