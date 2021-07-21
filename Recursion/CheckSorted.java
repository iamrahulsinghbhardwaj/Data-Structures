/*
Check if array is sorted
*/

package Recursion;

public class CheckSorted {
	
	public static boolean checksort(int a[]) {
		if(a.length<=1) {
			return true;
		}
		
		if(a[0]>a[1]) {
			return false;
		}
		
		int smallans[]=new int[a.length-1]; // create a new array then store the new value from index 1
		
		for(int i=1;i<a.length;i++) {
			smallans[i-1]=a[i];
		}
		
		return checksort(smallans);
		
		
	}

	public static void main(String[] args) {
		int a[]={1,3,2};
		
		System.out.println(checksort(a));
		
	}

}
