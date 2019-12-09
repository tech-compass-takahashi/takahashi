package standardClass;

public class Kadai5 {

	public static void main(String[] args) {
		// catのほうが多い

		String text1 = "cat_mouse_mouse_cat_cat";
		String arrAnimal[] = text1.split("_");
		for(int i = 0; i < arrAnimal.length;i ++ ) {
			if(arrAnimal[i]=="cat") {
				System.out.print("にゃー");
			}else {
				System.out.print("ちゅー");
			}
		}
	}
}