/* Minimum no of steps to convert string 1 to string 2 or vise versa*/
package DP;

public class EditDistance {
	
	public static int editdis(String s1,String s2) {
		if(s1.length()==0) {
			return s2.length();
		}
		
		if(s2.length()==0) {
			return s1.length();
		}
		
		
		if(s1.charAt(0)==s2.charAt(0)) {
			return editdis(s1.substring(1),s2.substring(1));
		}else {
			int op1=editdis(s1.substring(1),s2); //delete
			int op2=editdis(s1,s2.substring(1)); //insert
			int op3=editdis(s1.substring(1),s2.substring(1)); //substitute
			
			return 1+Math.min(op1,Math.min(op2, op3));
			
		}	
	}
	
	public static int editdisM(String s1,String s2) {
		int m=s1.length();
		int n=s2.length();
		
		
		int a[][]=new int[m+1][n+1];
		for(int i=0;i<=m;i++) {
			for(int j=0;j<=n;j++) {
				a[i][j]=-1;
			}
		}
		
		return editdisM(s1,s2,a);
		
	}
	
	public static int editdisM(String s1,String s2,int storage[][]) {
		
		int m=s1.length();
		int n=s2.length();
		
		if(storage[m][n]!=-1) {
			return storage[m][n];
		}
		
		if(m==0 ) {
			 storage[m][n]=n;
			 return storage[m][n];
		}
		if(n==0) {
			storage[m][n]=m;
			return storage[m][n];
		}
		
		if(s1.charAt(m)==s1.charAt(n)) {
			return storage[m][n]=editdisM(s1.substring(1),s2.substring(1),storage);
			
		}
		
		else {
			int op1=editdisM(s1,s2.substring(1),storage);
			int op2=editdisM(s1.substring(1),s2,storage);
			int op3=editdisM(s1.substring(1),s2.substring(1),storage);
			
			storage[m][n]=1+Math.min(op1,Math.min(op2,op3));
		}
		
		return storage[m][n];
	}
	
	public static int editdisDP(String s1,String s2) {
		int m=s1.length();
		int n=s2.length();
		
		int dp[][]=new int[m+1][n+1];
		
		for(int i=0;i<=m;i++) {
			dp[i][0]=i;
		}
		
		for(int j=0;j<=n;j++) {
			dp[0][j]=j;
		}
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(s1.charAt(m-i)==s2.charAt(n-j)) {
					dp[i][j]=dp[i-1][j-1];
				}else {
					dp[i][j]=1+Math.min(dp[i][j-1],
							Math.min(dp[i-1][j-1],dp[i-1][j]));
				}
			}
		}
		return dp[m][n];
	}

	public static void main(String[] args) {
		String s1="abrdfsdfsdfdsfsdfdskfjdskfjkdsl";
		String s2="axcddfdsjfkljds";
		
		System.out.println(editdis(s1,s2));
		
		System.out.println(editdisDP(s1,s2));
		System.out.println(editdisM(s1,s2));
	}

}
