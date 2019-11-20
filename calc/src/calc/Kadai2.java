package calc;

public class Kadai2 {

	public static void main(String[] args) {
		// 整数10,12,13の合計と平均(3と3.0で割った時)
        int number=10+12+13;
        int number2=(10+12+13)/3;
        double number3=(10+12+13)/3.0;

        //上記、合計と平均(3と3.0で割った時)
        System.out.println("合計:"+number);
        System.out.println("平均(3で割った時):"+number2);
        System.out.println("平均(3.0で割った時):"+number3);
	}

}
