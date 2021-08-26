package DP;
import java.util.*;
public class Fibonacci {
	
	public static int fibo(int n) {
		if(n==0 || n==1) {
			return n;
		}
		
		return fibo(n-1)+fibo(n-2);
	}
	
	public static int fiboM(int n) {
		int a[]=new int[n+1];
		
		for(int i=0;i<=n;i++) {
			a[i]=-1;
		}
		
		return fiboM(n,a);
		
	}
	
	public static int fiboM(int n,int a[]) {
		if(n==0 || n==1) {
			a[n]=n;
			return a[n];
		}
		
		if(a[n]!=-1) {
			return a[n];
		}
		
		a[n]=fiboM(n-1,a)+fiboM(n-2,a);
		return a[n];
	}
	
	public static int fiboDP(int n) {
		int storage[]=new int[n+1];
		
		storage[0]=0;
		storage[1]=1;
		
		for(int i=2;i<=n;i++) {
			storage[i]=storage[i-1]+storage[i-2];
		}
		
		return storage[n];
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		
		System.out.println(fiboM(n));
		System.out.println(fiboDP(n));
		System.out.println(fibo(n));
	}

}
