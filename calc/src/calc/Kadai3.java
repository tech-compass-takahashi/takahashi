package calc;

public class Kadai3 {

	public static void main(String[] args) {
		//Scannerを用いて3つの整数の合計、平均（3と3.0で割った）
		System.out.println("整数を３つ入力してください");
        int number1=new java.util.Scanner(System.in).nextInt();
        int number2=new java.util.Scanner(System.in).nextInt();
        int number3=new java.util.Scanner(System.in).nextInt();

        //合計、平均(3と3.0で割った値)
        int sum=number1+number2+number3;
        int avg=(number1+number2+number3)/3;
        double doubleAvg=(number1+number2+number3)/3.0;

        //合計、平均(3と3.0で割った値)出力
        System.out.println("合計:"+sum);
        System.out.println("平均(3で割った数):"+avg);
        System.out.println("平均(3.0で割った数):"+doubleAvg);
	}
}
