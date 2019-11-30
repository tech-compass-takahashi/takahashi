package vrietyArray;
import java.util.ArrayList;
public class Kadai1 {

	public static void main(String[] args) {
		/*北海道
		 * 東北
		 * 関東
		 * 中部
		 * 近畿
		 * 中国
		 * 九州
		 */
		ArrayList<String>text=new ArrayList<>();
		text.add("北海道");
		text.add("東北");
		text.add("関東");
		text.add("中部");
		text.add("近畿");
		text.add("中国");
		text.add("九州");
		for(String text2:text) {
			System.out.println(text2);
		}
	}

}
