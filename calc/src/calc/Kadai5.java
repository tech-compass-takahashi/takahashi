package calc;

public class Kadai5 {

	public static void main(String[] args) {
		// 課題5-1:"ノートPCの値段:,89800円"文字列.文字.数値を用いて出力
		String a="ノートPCの値段:";
		int b=89800;
		char c='円';
        System.out.println(a+b+c);

        //課題5-2:標準入力で文字列を受け取り、それを連結させて出力
        System.out.println("好きな言葉を2つ入力してください");
        String text1=new java.util.Scanner(System.in).nextLine();
        String text2=new java.util.Scanner(System.in).nextLine();
        System.out.println(text1+text2);
	}

}
