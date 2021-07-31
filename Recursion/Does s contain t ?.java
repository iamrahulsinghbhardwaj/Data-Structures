/*
Given two string s and t, write a function to check if s contains all characters of t (in the same order as they are in string t).
Return true or false.
Do it recursively.
E.g. : s = “abchjsgsuohhdhyrikkknddg” contains all characters of t=”coding” in the same order. So function will return true.
Input Format :
Line 1 : String s
Line 2 : String t
Output Format :
true or false
Sample Input 1 :
abchjsgsuohhdhyrikkknddg
coding
Sample Output 1 :
true
Sample Input 2 :
abcde
aeb
Sample Output 2 :
false

*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String large = s.nextLine();
		String small = s.nextLine();

		System.out.println(Solution.checkSequence(large, small));
	}
}

public class Solution {
	public static boolean checkSequence(String a, String b) {
        
        	if(b.length()>a.length()){
                return false;
            }
        	
        	int len=0;
        
        	for(int i=0;i<a.length();i++){
                if(b.charAt(len)==a.charAt(i)){
                    len++;
                }
                
                if(len==b.length()){
                    return true;
                }
            }
        
        return false;
    }
    
}
