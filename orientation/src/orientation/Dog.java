package orientation;

public class Dog extends Animal{

	String name;
	int age;
	double weight;

	public Dog(String name) {
		this.name = "ポチ";
		this.age = 5;
		this.weight = 12.3;
	}

	public void run() {
		System.out.println(this.name + "は走った");
	}

	public void sleep() {
		System.out.println(this.name + "は眠った");
	}
}
