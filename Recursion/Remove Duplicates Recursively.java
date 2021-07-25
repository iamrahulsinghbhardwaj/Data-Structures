/*
Given a string S, remove consecutive duplicates from it recursively.
Input Format :
String S
Output Format :
Output string
Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string
Sample Input 1 :
aabccba
Sample Output 1 :
abcba
Sample Input 2 :
xxxyyyzwwzzz
Sample Output 2 :
xyzwz
*/

import java.util.Scanner;

public class Main {
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
    	String input = s.next();
    	System.out.println(Solution.removeConsecutiveDuplicates(input));
    }
}

public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
        if(s.length()<=1){
            return s;
        }
        
        String str=removeConsecutiveDuplicates(s.substring(1));
        
        if(s.charAt(0)==str.charAt(0)){
            return s.charAt(0)+str.substring(1);
        }
        
        return s.charAt(0)+str;
	}

}
