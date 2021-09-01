package DP;

public class MInPath {
	
	public static int pathM(int arr[][]) {
		
		int storage[][]=new int[arr.length][arr[0].length];
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				storage[i][j]=-1;
			}
		}
		
		return pathM(arr,0,0,storage);
	}
	
	public static int pathM(int arr[][],int l,int r,int storage[][]) {
		int m=arr.length;
		int n=arr[0].length;
		
		if(l>=m || r>=n) {
			return Integer.MAX_VALUE;
		}
		
		if(l==m-1 && r==n-1) {
			storage[m-1][n-1]=arr[l][r];
			return storage[l][r];
		}
		
		if(storage[l][r]!=-1) {
			return storage[l][r];
		}
		
		int a=pathM(arr,l+1,r+1,storage);
		int b=pathM(arr,l,r+1,storage);
		int c=pathM(arr,l+1,r,storage);
		
		storage[l][r]=arr[l][r]+Math.min(a,Math.min(b, c));
		
		return storage[l][r];
	}
	
	public static int pathDP(int arr[][]) {
		int m=arr.length;
		int n=arr[0].length;
		
		int storage[][]=new int[m][n];
		
		storage[m-1][n-1]=arr[m-1][n-1];
		
		for(int i=n-2;i>=0;i--) {
			storage[m-1][i]=storage[m-1][i+1]+arr[m-1][i];
		}
		
		for(int i=n-2;i>=0;i--) {
			storage[i][n-1]=storage[i+1][n-1]+arr[i][n-1];
		}
		
		
		for(int i=m-2;i>=0;i--) {
			for(int j=n-2;j>=0;j--) {
				storage[i][j]=arr[i][j]+Math.min(storage[i][j+1],
						Math.min(storage[i+1][j+1], storage[i+1][j]));
			}
		}
		
		return storage[0][0];
	}

	public static void main(String[] args) {
		int arr[][]= {{1,1,1},{4,5,2},{7,8,9}};
		
		System.out.println(pathM(arr));
		System.out.println(pathDP(arr));
	}

}
