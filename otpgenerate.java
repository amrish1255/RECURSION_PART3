package RECURSION_PART4;

public class otpgenerate {
	// static variable is a globle variable if we use the static variable then in
	// case the change in main function reflecct
	int count = 1;

	public static void main(String[] args) {

		String str = "0123456789";
		print_OTP(str, "");
		return;

	}

// four digit otp generate by using 0 to 9 digit number
	public static void print_OTP(String que, String ans) {
		// base case
		if (que.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < que.length(); i++) {
			String str1 = que.substring(0, i) + que.substring(i + 1);
			char ch = que.charAt(i);
			print_OTP(str1, ans + ch);

		}

	}

}
