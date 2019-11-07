package demo;

public class IsPalindrome {

	public static void main(String[] args) {
		String input = "`l;`` 1o1 ??;l`";
		System.out.println(isPalindrome(input));

	}

	public static boolean isPalindrome(String s) {

		char[] input = s.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
		System.out.println(input);
		for (int i = 0; i < input.length / 2; i++) {
			if (input[i] != input[input.length - i - 1]) {
				System.out.println(input[i]);
				return false;
			}
		}
		return true;

	}

}
