package Sorting;

public class SelectionSort {
	
	public static void sort(int a[]) {
		
		for(int i=0;i<a.length-1;i++) {
			int minindex=i;
			
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[minindex]) {
					minindex=j;
				}
			}
			
			int temp=a[minindex];
			a[minindex]=a[i];
			a[i]=temp;
		}
	}

	public static void main(String[] args) {
		int a[]={1333,20,-3,400000};
		

		sort(a);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}

	}

}
