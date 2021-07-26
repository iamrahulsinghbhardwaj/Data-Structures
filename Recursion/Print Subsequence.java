package Recursion;
import java.util.*;
public class PrintSubsequence {
	
	public static void sub(String input,String output) {
		if(input.length()==0) {
			System.out.println(output);
			return;
		}
		
		//not including first char
		
		sub(input.substring(1),output);
		
		//including first char
		
		sub(input.substring(1),output+input.charAt(0));
		
	}
	
	public static void sub(String str) {
		sub(str,"");	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		
		sub(str);
	}

}
