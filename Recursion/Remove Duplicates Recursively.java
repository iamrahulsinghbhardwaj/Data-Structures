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

//Second technique bottom up approach (basically break the string first then do the work)

 public static String remove(String stringname,String finalstring){
       if(stringname.length()<=1){
            return stringname;
        }
        
        String tempstring=remove(stringname.substring(1),finalstring);
        
        if(stringname.charAt(0)!=tempstring.charAt(0)) {
        	finalstring=stringname.charAt(0)+tempstring;
        }else {
        	return tempstring;
        }
        return finalstring;
    }

