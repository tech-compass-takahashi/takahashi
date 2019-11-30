package vrietyArray;
import java.util.HashMap;
public class Kadai3 {

	public static void main(String[] args) {
		/*りんご：１３０円
		 *メロン：６０００円
		 * みかん：１２０円
		 * バナナ：９８円
		 */

		//mapに格納(キーはフルーツ名、値は数値)
		HashMap<String,String>fruitPrice=new HashMap<>();
		fruitPrice.put("りんご",":130");
		fruitPrice.put("メロン",":6000");
		fruitPrice.put("みかん",":120");
		fruitPrice.put("バナナ",":98");

		for (HashMap.Entry<String, String> entry : fruitPrice.entrySet()) {
			System.out.println(entry.getKey()  + entry.getValue()+"円");
		}
	}

}
