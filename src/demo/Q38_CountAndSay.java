package demo;

public class Q38_CountAndSay {

	public static void main(String[] args) {
		System.out.println(countAndSay(1));
		System.out.println(countAndSay(2));
		System.out.println(countAndSay(3));
		System.out.println(countAndSay(4));
		System.out.println(countAndSay(5));
	}

	public static String countAndSay(int n) {
		if (n == 1)
			return "1";

		StringBuilder sb = new StringBuilder();
		String res = countAndSay(n - 1);
		char current = res.charAt(0);
		int count = 0;
		for (int i = 0; i < res.length(); i++) {

			if (current == res.charAt(i)) {
				count++;
			} else {
				sb.append(count);
				sb.append(current);
				current = res.charAt(i);
				count = 1;
			}
		}
		sb.append(count);
		sb.append(current);

//		System.out.println(sb.toString());
		return sb.toString();

	}

}
