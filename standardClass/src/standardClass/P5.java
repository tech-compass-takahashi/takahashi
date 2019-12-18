package standardClass;

public class P5 {

	public static void main(String[] args) {
		// catのほうが多い
		String a;
		int catCount = 0;
		int mouseCount = 0;
		String nameAnimal = "cat";
		String text = "cat_mouse_mouse_cat_cat";

		String arrAnimal[] = text.split("_");

		for(String textAnimal:arrAnimal) {
			int animalCount = nameAnimal.equals(textAnimal) ? ++catCount : ++mouseCount;
		}

		if(catCount > mouseCount) {
			System.out.print("catのほうが多い");
		}else {
			System.out.print("mouseのほうが多い");
		}
	}
}

//catのほうが多い

		//int catCount = 0;
		//int mouseCount = 0;
		//String nameAnimal = "cat";
		//String text = "cat_mouse_mouse_cat_cat";

		//String arrAnimal[] = text.split("_");

		//for(String textAnimal:arrAnimal) {
			//if(nameAnimal.equals(textAnimal)) {
				//++catCount;
			//}else {
				//++mouseCount;
			//}
		//}

		//if(catCount > mouseCount) {
			//System.out.print("catのほうが多い");
		//}else {
			//System.out.print("mouseのほうが多い");
		//}
	//}
