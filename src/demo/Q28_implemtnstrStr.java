package demo;

public class Q28_implemtnstrStr {

	public static void main(String[] args) {
		String str = "mississippi";
		String needle = "issip";
		System.out.println(strStr(str, needle));
	}

	public static int strStr(String haystack, String needle) {
		if (needle.length() == 0) {
			return 0;
		} else if (haystack.length() < needle.length()) {
			return -1;
		} else if (haystack.equals(needle)) {
			return 0;
		}
		for (int i = 0; i < haystack.length() - needle.length(); i++) {
			if (haystack.charAt(i) == needle.charAt(0)) {
				for (int j = 0; j < needle.length(); j++) {
					if (haystack.charAt(i + j) != needle.charAt(j)) {
						break;
					}
					if (j == needle.length() - 1) {
						return i;
					}
				}
			}
		}

		return -1;
	}
}
