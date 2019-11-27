package loop;

public class Kadai5 {

	public static void main(String[] args) {
		// 九九表を作成
		for(int num=1;num<=9;num++) {
			for(int num2=1;num2<=9;num2++) {
				if(num*num2<10) {
					System.out.print("  "+num*num2);
				}else {
					System.out.print(" "+num*num2);
				}
			}
			System.out.println();
		}
	}

}