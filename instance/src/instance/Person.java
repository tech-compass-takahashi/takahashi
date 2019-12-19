package instance;

public class Person {
	String name = "";
	int age = 0;

	public void myProfile() {
		this.name = "高橋義明";
		this.age = 25;

		System.out.println("私の名前は" + this.name + "です。");
		System.out.println("私の年齢は" + this.age + "です。");
		System.out.println("よろしくお願いします。");
	}
}