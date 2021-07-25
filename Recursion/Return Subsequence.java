package Recursion;
import java.util.*;
public class ReturnSubsequence {
	
	
	public static String[] subseq(String str) {
		if(str.length()==0) {
			 String ans[]= {""};
			 return ans;
		}
		
		String smallans[]=subseq(str.substring(1));
		
		String ans[]=new String[smallans.length*2];
		
		for(int i=0;i<smallans.length;i++) {
			ans[i]=smallans[i];
		}
		
		for(int i=0;i<smallans.length;i++) {
			ans[smallans.length+i]=str.charAt(0)+smallans[i];
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		String a[]=subseq(str);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
  }
}
