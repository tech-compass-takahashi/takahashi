package loop;

public class Kadai2 {

	public static void main(String[] args) {
		//数字入力の支持を表示
        System.out.print("数字を入力してください:");

		//整数を受け取り、１からその整数までを順番に足した式と結果
        int sum=0;
		int num=new java.util.Scanner(System.in).nextInt();
        for(int num2=1;num2<=num;num2++){
        	sum+=num2;
        //計算式と1以外の数字の前に+を表示
        	if(num2!=1) {
        		System.out.print("+");
        	}
        	//1～受け取った数字表示
        	System.out.print(num2);
        }
        //1～受け取った数字までの合計を表示
        System.out.print("="+sum);
	}
}