package vrietyArray;
import java.util.ArrayList;
public class Kadai2 {

	public static void main(String[] args) {
		/*奇数：[21,3,99,51,1,87,11〕
		 *偶数：[32,6,72,78,26,48,60,]
		 */
		//配列に数字を格納
		int[]array={21,3,32,6,99,72,78,51,1,26,87,11,48,60};
		ArrayList<Integer>numbers1=new ArrayList<>();
		ArrayList<Integer>numbers2=new ArrayList<>();

		//格納された数字を奇数と偶数に分ける
		int num2=0;
		for(int num=0;num<array.length;num++) {
			num2=array[num];
			if(num2%2==0) {
				numbers1.add(num2);
			}else {
				numbers2.add(num2);
			}
		}
		//それぞれ奇数と偶数を表示する
		System.out.println("奇数:"+numbers2);
		System.out.println("偶数："+numbers1);
	}
}