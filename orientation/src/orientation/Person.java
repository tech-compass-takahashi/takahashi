package orientation;

public class Person {

	static int wallet = 0;
	private String name;
	private int age;

	public String getName() {
		return this.name;
	}

	public void setName() {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}

	public void setAge() {
		this.age = age;
	}

	Person(int money){
		Person.wallet += money;

	}

	Person (String name){
		this.name = "高橋義明";
		this.age = 25;
	}

	Person (){
		this("ダミー");
	}

	//プロフィールメソッド
	public void myProfile(){
		System.out.println("私の名前は" + this.name + "です。");
		System.out.println("私の年齢は" + this.age + "です。");
		System.out.println("よろしくお願いします。");
	}
}