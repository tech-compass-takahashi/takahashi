package method;

public class Kadai5 {
	/*ーーー配列にnullがない場合ーーー
	 *false
	 *ーーー配列にnullがある場合ーーー
	 *true
	 */
	public static void main(String[] args) {
		//配列にnullがない場合
		String[]array = {"text1", "text2"};
		System.out.println("ーーー配列にnullがない場合ーーー");
        System.out.println(task5(array));

        //配列にnullがある場合
        String[]array1 = {"text3", null};
        System.out.println("ーーー配列にnullがある場合ーーー");
    	System.out.println(task5(array1));
	}
	public static boolean task5(String[] array) {
		boolean a = false;
		for(int i = 0;i < array.length;i ++ ) {
			if(array[i] == null) {
				a = true;
			}
		}
		return a;
	}
}
