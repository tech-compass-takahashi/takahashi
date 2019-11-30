package vrietyArray;
import java.util.ArrayList;
import java.util.HashMap;
public class Kadai4 {

	public static void main(String[] args) {
		/*【想定結果】
		 * {偶数:=[32,6,72,78,26,48,60,46,74,14],
		 *   奇数:=[21,3,99,51,1,87,11,29,5,193,215,83]}
		 */

		//配列に21,3,32,6,99,72,78,51,1,26,87,11,48,60,29,5,46,74,14,193,215,83格納
		int[]arrayNum= {21,3,32,6,99,72,78,51,1,26,87,11,48,60,29,5,46,74,14,193,215,83};

		//格納した数字を奇数と偶数に分けて、それぞれ別のArrayListに格納
		ArrayList<Integer>evenNumber=new ArrayList<>();
		ArrayList<Integer>oddNumber=new ArrayList<>();
		int arrayNum2=0;
		for(int i=0;i<arrayNum.length;i++) {
			arrayNum2=arrayNum[i];
			if(arrayNum2%2==0) {
				evenNumber.add(arrayNum2);
			}else {
				oddNumber.add(arrayNum2);
			}
		}

		//出力はSystem.out.printlnにmap変数を指定
		HashMap<String,ArrayList>map=new HashMap<>();
		map.put("{偶数:",evenNumber);
		map.put("  奇数:=",oddNumber);
		for (HashMap.Entry<String, ArrayList> entry : map.entrySet()) {
			System.out.print(entry.getKey());
			System.out.print(entry.getValue());
			System.out.println();
		}
	}
}