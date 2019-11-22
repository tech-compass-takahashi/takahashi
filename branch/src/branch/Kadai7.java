package branch;

public class Kadai7 {

	public static void main(String[] args) {
		System.out.println("病院に行く曜日を入力してください。");
		System.out.println("【日曜日、月曜日、火曜日、水曜日、木曜日、金曜日、土曜日】");

		/*
		 * 月～金の場合”午前診療と午後診療があります”と出力
		 * 土　　の場合”土曜日は午前診療のみです”と出力
		 * 日　　の場合”日曜は休診です”と出力
		 * その他は”入力を確認してください”と出力
		 */
         String text=new java.util.Scanner(System.in).nextLine();
         switch(text){
        	 case"月曜日":
        		 text="午前中診療と午後診療があります";
        		 break;
        	 case"火曜日":
        		 text="午前中診療と午後診療があります";
        		 break;
        	 case"水曜日":
        		 text="午前中診療と午後診療があります";
        		 break;
        	 case"木曜日":
        		 text="午前中診療と午後診療があります";
        		 break;
        	 case"金曜日":
        		 text="午前中診療と午後診療があります";
        		 break;
        	 case"土曜日":
        		 text="土曜日は午前診療のみです";
        		 break;
        	 case"日曜日":
        		 text="日曜日は休診です";
        		 break;
        	 default:
        		 text="入力を確認してください";
        		 break;
         }
         System.out.println(text);
	}

}
