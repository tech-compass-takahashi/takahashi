package branch;

public class Kadai1 {

	public static void main(String[] args) {
		// 10以上数字を受け取り表示
		System.out.println("10以上の数字を入力してください。");
		int num1=new java.util.Scanner(System.in).nextInt();
		//10以上の場合は値：数となる
        if(num1>=10) {System.out.println("値:"+num1);
        }
        //10以下の場合は値：2倍の数となる
        if(num1<=9){System.out.println("値:"+num1*2);
        }
    }
}