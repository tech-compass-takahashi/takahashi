package array;

public class Kadai1 {

	public static void main(String[] args) {
		/*
		 * 想定結果
		 * 配列：[4,9,19,5,8,21,42,64,73,18,2]
		 * 合計：265
		*/
		int[]array= {4,9,19,5,8,21,42,64,73,18,2};
		System.out.print("配列:[");
		for(int num=0;num<array.length;num++) {
			System.out.print(array[num]);
			if(num!=10) {
				System.out.print(",");
			}
		}
		System.out.print("]");
		System.out.println();
		System.out.print("合計:");
		int sum=0;
		for(int array2:array) {
			sum+=array2;
		}
		System.out.print(sum);
	}

}