package standardClass;

public class P5 {

	public static void main(String[] args) {
		String arrAnimal[] = "cat_mouse_mouse_cat_cat".split("_");
		//前回
		int catCount = 0;
		int mouseCount = 0;

		String nameAnimal1 = "cat";
		for(String nameAnimal2 : arrAnimal) {
			if(nameAnimal1.equals(nameAnimal2)) {
				++catCount;
			}else {
				++mouseCount;
			}
		}

		if(catCount>mouseCount) {
			System.out.print("catのほうが多い");
		}else {
			System.out.print("mouseのほうが多い");
		}
	}
}