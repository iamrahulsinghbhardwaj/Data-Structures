
package Sorting;

public class BubbleSort {
	
	public static void sort(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	
	public static void main(String args[]) {
		int a[]={1333,20,-3,4};
		
		sort(a);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
	}
}
