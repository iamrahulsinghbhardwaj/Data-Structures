package Recursion;
import java.util.*;

public class Factorial {
	
	public static int fact(int n) {
    //base condition
		if(n==0) {
			return 1;
		}
		
		int smallans=fact(n-1);
		return n*smallans;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		System.out.println(fact(n));
	}

}
