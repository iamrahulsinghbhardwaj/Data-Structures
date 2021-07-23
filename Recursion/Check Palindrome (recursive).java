/*
Check whether a given String S is a palindrome using recursion. Return true or false.
Input Format :
String S
Output Format :
'true' or 'false'
Constraints :
0 <= |S| <= 1000
where |S| represents length of string S.
Sample Input 1 :
racecar
Sample Output 1:
true
Sample Input 2 :
ninja
Sample Output 2:
false
*/

import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.isStringPalindrome(input));
	}
}



public class solution {

	public static boolean isStringPalindrome(String input) {
        return isStringPalindrome(input,0,input.length()-1);
	}
    
    public static boolean isStringPalindrome(String input,int l,int r){
        if(input.length()<=1 || l>=r){
            return true;
        }
        
        
        if(input.charAt(l)!=input.charAt(r) ){
            return false;
        }
        
        return isStringPalindrome(input,l+1,r-1);
    }
}
