/*
Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".
Sample Input 1 :
xpix
Sample Output :
x3.14x
Sample Input 2 :
pipi
Sample Output :
3.143.14
Sample Input 3 :
pip
Sample Output :
3.14p
*/

import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.replace(input));
	}
}


public class solution {

	// Return the changed string
	public static String replace(String input){
       if(input.length()<=1){
           return input;
       }
        
        String ans=replace(input.substring(1));
        
        if(input.charAt(0)=='p' && ans.charAt(0)=='i'){
            return "3.14"+ans.substring(1);
        }
        
        return input.charAt(0)+ans;
        
	}
}
