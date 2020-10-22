package demo;

public class Q0013_RomantoInteger {

	public static void main(String[] args) {

		String input = "MCMXCIV";
		System.out.println(romanToInt(input));

	}

	public static int romanToInt(String s) {
		int res = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'C' && i < s.length() - 1) {
				if (s.charAt(i + 1) == 'D') {
					res += 400;
					i ++;
				} else if (s.charAt(i + 1) == 'M') {
					res += 900;
					i++;
				}
			} else if (s.charAt(i) == 'X' && i < s.length() - 1) {
				if (s.charAt(i + 1) == 'L') {
					res += 50;
					i++;
				} else if (s.charAt(i + 1) == 'C') {
					res += 100;
					i++;
				}
			} else if (s.charAt(i) == 'I' && i < s.length() - 1) {
				if (s.charAt(i + 1) == 'V') {
					res += 4;
					i++;
				} else if (s.charAt(i + 1) == 'X') {
					res += 9;
					i++;
				}
			} else if (i < s.length()) {
				if (s.charAt(i) == 'M')
					res += 1000;
				if (s.charAt(i) == 'D')
					res += 500;
				if (s.charAt(i) == 'C')
					res += 100;
				if (s.charAt(i) == 'L')
					res += 50;
				if (s.charAt(i) == 'X')
					res += 10;
				if (s.charAt(i) == 'V')
					res += 5;
				if (s.charAt(i) == 'I')
					res += 1;
			}
		}
		return res;
	}

}
