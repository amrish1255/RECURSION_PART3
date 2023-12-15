package RECURSION_PART4;

public class combination_ofPhone_Number {

	static String[] key = { "", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12";
		pressNumber(str, "");

	}

	public static void pressNumber(String que, String ans) {
		// 12 pass as a string

		// base case
		if (que.length() == 0) {
			System.out.println(ans +"");
			return ;
		}

		char ch = que.charAt(0);// 1
		String press = key[ch - 48];
		for (int i = 0; i < press.length(); i++) {

			pressNumber(que.substring(1), ans + press.charAt(i));

		}

	}

}
