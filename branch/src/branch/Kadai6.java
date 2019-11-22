package branch;

public class Kadai6 {

	public static void main(String[] args) {
		// 1から５までの数字を入力
		System.out.println("1から5まで数字を入力してください。");
		//1～5を定義
		String num=new java.util.Scanner(System.in).nextLine();

		//条件文作成（swith文）
		switch(num){
			case "1":
				num="Ⅰ";
				break;
			case"2":
				num="Ⅱ";
				break;
			case"3":
				num="Ⅲ";
				break;
			case"4":
				num="Ⅳ";
				break;
			case"5":
				num="Ⅴ";
				break;
		    default:
			    num="unknow";
			    break;
		}
		System.out.println(num);

	}

}
