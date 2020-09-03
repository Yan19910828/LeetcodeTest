package demo;

import java.util.HashMap;
import java.util.Map;

public class Q3_longestSubstring {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abba"));
	}
	
	 public static int lengthOfLongestSubstring(String s) {
	        if(s.length()==0 || s==null) return 0;
	        Map<Character, Integer> map= new HashMap<>();
	        int res=0;
	        int j=0;
	        for(int i=0;i<s.length();i++){
	            if(map.containsKey(s.charAt(i))){
	                j=Math.max(j,map.get(s.charAt(i))+1);
	            }
	            map.put(s.charAt(i),i);
	            res=Math.max(res, i-j+1);
	        }
	        return res;
	    }
}


/*
 *����˼�� - ˫ָ�� 
 * ��1��������ζ�Ҫ����i��hashmapλ��
 * ��2abba�������Ҫ�Ƚ�j�� ��ǰ��ĸ+1��λ��
 * 
 * 
 */
