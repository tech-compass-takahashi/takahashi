package instance;

public class Person {
	String name="高橋義明";
	int age=25;

	public void myProfile() {
		System.out.println("私の名前は"+this.name+"です。");
		System.out.println("私の年齢は"+this.age+"です。");
		System.out.println("よろしくお願いします。");
	}
}