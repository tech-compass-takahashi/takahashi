package practice;

public class Array {

	public static void main(String[] args) {
		// カリキュラム　例　１
		int[]array=new int[6];
		System.out.println(array[0]);//←[6]は何を表しているのか？

		double []array2=new double[6];
		System.out.println(array2[0]);//←[6]は何を表しているのか？

		int[]array3= {1,2,3,4,};
		System.out.println(array3[0]);//←0が{1,2,3,4,}の1を表示

		String[]array4=new String[] {"東","西","南","北"};
		System.out.println(array4[0]);//←0が{"東","西","南","北"};の東を表示
	}

}
