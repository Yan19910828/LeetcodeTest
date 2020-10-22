package demo;

import java.util.HashMap;

public class Q0009_PalindromeNumber {

	public static void main(String[] args) {
		int input=121;
		System.out.println(isPalindrome(input));

	}
	public  static boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x<10) return true;
        HashMap<Integer,Integer> map=new HashMap<>();
        int res=x;
        int rem=0;
        int ans=0;
        while(res>0){
        	rem=res%10;
            res=res/10;
            ans=ans*10+rem;
        }
        if(ans ==x) {
            return true;
        }else{
            return false;
        }
    }

}

/*
 * 先取榆树再取商
 * 
 * 
 * 
*/

