package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q0008_StringToInteger {

	public static void main(String[] args) {
		String t1 = "   -42";
		String t2 = "4193 with words";
		String t3 = "words and 987";
		String t4 = "-91283472332";
		String t5 = "9223372036854775808";
		String t6 = "2147483648";

		System.out.println(myAtoi(t1));
		System.out.println(myAtoi(t2));
		System.out.println(myAtoi(t3));
		System.out.println(myAtoi(t4));
		System.out.println(myAtoi(t5));
		System.out.println(myAtoi(t6));
	}

	public static int myAtoi(String str) {
		int sign = 1;
		long res = 0;
		int i = 0;
		str = str.trim();
		if (str.isEmpty()) {
			return 0;
		}
		char[] arr = str.toCharArray();
		List<Integer> list = new ArrayList<>();

		if (arr[0] == '-') {
			sign = -1;
			arr = Arrays.copyOfRange(arr, 1, arr.length);
		} else if (arr[0] == '+') {
			arr = Arrays.copyOfRange(arr, 1, arr.length);
		} else if (arr[0] < '0' || arr[0] > '9') {
			return 0;
		}

		for (; i < arr.length; i++) {
			if (arr[i] < '0' || arr[i] > '9') {
				break;
			}
			list.add(Character.getNumericValue(arr[i]));
		}

		for (i = 0; i < list.size(); i++) {
			if (sign == 1 && (Integer.MAX_VALUE - res * 10) < list.get(i)) {
				return Integer.MAX_VALUE;
			} else if (sign == -1 && (Integer.MAX_VALUE - res * 10 < list.get(i) - 1)) {
				return Integer.MIN_VALUE;
			} else {
				res = 10 * res + list.get(i);
			}
		}
		return (int) (res * sign);

	}

}
