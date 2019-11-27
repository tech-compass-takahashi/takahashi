

package array;
import java.util.Random;
public class Kadai3 {

	public static void main(String[] args) {
		/*[7,7,7,7,7,7]
		 * 最大値：7
		 * 最小値：7
		 */
			System.out.print("[");
		    Random rand = new Random();
		    int max=0;
		   int min=0;

		    for(int num2=0;num2<6;num2++) {
		    	  int num = rand.nextInt(10);
				    System.out.print(num);
				    if(num2!=5) {
				    	 System.out.print(",");
				    }
				    if(max<num) {
				    	max=num;
				    }
				    if(max>num) {
				    	min=num;
				    }
		    }
		    System.out.println("]");
		    System.out.println("最大値:"+max);
		    System.out.println("最小値:"+min);
	}

}