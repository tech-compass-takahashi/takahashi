package standardClass;

public class Kadai5 {

	public static void main(String[] args) {
		// catのほうが多い

		int catCount = 0;
		int mouseCount = 0;
		String nameAnimal = "cat";
		String text = "cat_mouse_mouse_cat_cat";

		String arrAnimal[] = text.split("_");

		for(String texAnimal:arrAnimal) {
			if(nameAnimal.equals(texAnimal)) {
				++catCount;
			}else {
				++mouseCount;
			}
		}

		if(catCount > mouseCount) {
			System.out.print("catのほうが多い");
		}else {
			System.out.print("mouseのほうが多い");
		}
	}
}