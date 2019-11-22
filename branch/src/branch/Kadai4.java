package branch;

public class Kadai4 {

	public static void main(String[] args) {
		// 最初に受け取った正の整数をnumA
		//2番目に受けとった正の整数をnumB
		System.out.println("整数2つ入力してください");

		int numA=new java.util.Scanner(System.in).nextInt();
		int numB=new java.util.Scanner(System.in).nextInt();
		if(numA<=0||numB<=0){
			System.out.println("正の整数を入力してください。");
		}else if(numA%numB==0) {
		System.out.println("numBはnumAの約数です。");
		}else if(numA%numB>=1){
			System.out.println("numBはnumAの約数ではないです");
		}
	}
}