package Collections;
import java.util.*;
public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(squareroot(num));
		System.out.println(squarerootbinary(num));
	}
	
	public static int squarerootbinary(int x) {
		if(x==0 || x==1) {
			return x;
		}
		
		int lowerbound=2;
		int maxbound=x;
		int ans=0;
		
		
		while(lowerbound<=maxbound) {
			int mid=(lowerbound+maxbound)/2;
			int num=mid*mid;
			
			if(num==x) {
				return mid;
			}
			else if(num<x) {
				lowerbound++;
				ans=mid;
			}else {
				maxbound--;
			}	
			
		}
		
		return ans;
	}
	
	public static int squareroot(int x) {
		int squraenum=0;
		int ans=0;
		for(int i=1;i*i<=x;i++ ) {
			 squraenum=i*i;
			 ans=i;
			if(squraenum==x) {
				return i;
			}
		}
		
		return ans;
	}

}
