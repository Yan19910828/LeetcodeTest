package demo;

import java.util.Arrays;

public class MerTest {

	public static boolean ana(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
			
		char[] tempS = s.toCharArray();
		char[] tempT = t.toCharArray();
		Arrays.sort(tempS);
		Arrays.sort(tempT);
			
		for(int i =0; i<tempS.length; i++) {
			if(tempS[i] != tempT[i])
				return false;
		}
		return true;
}

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		System.out.println(ana(s,t));
		String s2 = "rat"; 
		String t2 = "car";
		System.out.println(ana(s2,t2));
	}

}
