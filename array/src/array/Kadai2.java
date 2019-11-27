package array;

public class Kadai2 {

	public static void main(String[] args) {
		/*想定結果
		 * 7,6,5,4,3,2,1
		 * 1,2,3,4,5,6,7
		 */
		int [] array={7,6,5,4,3,2,1};
		for(int num=0;num<array.length;num++) {
			System.out.print(array[num]);
			if(num!=6) {
				System.out.print(",");
			}
		}
		System.out.println();
		for(int num=6;num>=0;num--) {
			System.out.print(array[num]);
			if(num!=0) {
				System.out.print(",");
			}
		}
			}

}