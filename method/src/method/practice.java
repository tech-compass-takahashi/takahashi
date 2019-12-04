package method;

public class practice {
	/*ーーー配列にnullがない場合ーーー
	 *false
	 *ーーー配列にnullがある場合ーーー
	 *true
	 */
	public static void main(String[] args) {

		//String text1=new java.util.Scanner(System.in).nextLine();
		//String text2=new java.util.Scanner(System.in).nextLine();

		String[]array= {"text1","text2"};
		boolean a=task5(array);

		System.out.println("ーーー配列にnullがない場合ーーー");
        System.out.println(a);

        String[]array1= {"text3",null};
		boolean b=task5(array1);
        System.out.println("ーーー配列にnullがある場合ーーー");
    	System.out.println(b);
	}
	public static boolean task5(String[] array) {
		boolean a=false;
		for(int i=0;i<array.length;i++) {
			if(array[i]==null) {
			a=true;
			}
		}
		return a;
	}
}
