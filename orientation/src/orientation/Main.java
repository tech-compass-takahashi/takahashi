package orientation;

public class Main {

	public static void main(String[] args) {
		System.out.println("インスタンスを生成していない状態");
		System.out.println(Person.wallet);

		Person hoge01 = new Person(1000);
		Person hoge02 = new Person(2000);

		System.out.println("インスタンスhoge01でwalletにアクセス");
		System.out.println(hoge01.wallet);
		System.out.println("インスタンスhoge02でwalletにアクセス");
		System.out.println(hoge02.wallet);
		System.out.println("クラスPersonでwalletにアクセス");
		System.out.println(Person.wallet);

		//下記、課題５のコード内容
		System.out.println();

		Dog dogData = new Dog("ポチ情報");
		System.out.println("名前：" + dogData.name);
		System.out.println("年齢：" + dogData.age + "歳");
		System.out.println("体重：" + dogData.weight + "㎏");

		Dog dogRun = new Dog("ポチ走った");
		dogRun.run();

		Animal animal = new Animal();
		animal.sleep();

		Dog dog = new Dog("ポチは眠った");
		dog.sleep();
	}
}
