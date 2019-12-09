package practice;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// カリキュラム例１
		ArrayList<String>a=new ArrayList<>();
		a.add("aaa");
		a.add("bbb");
		a.add("ccc");

		for(String b:a) {
		System.out.println(b);
		}
	}

}
