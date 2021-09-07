package DP;

public class LCS {
	
	public static int lcs(String s1,String s2) {
		if(s1.length()==0 || s2.length()==0) {
			return 0;
		}
		
		if(s1.charAt(0)==s2.charAt(0)) {
			return 1+lcs(s1.substring(1),s2.substring(1));
		}else {
			int op1=lcs(s1,s2.substring(1));
			int op2=lcs(s1.substring(1),s2);
			int op3=lcs(s1.substring(1),s2.substring(1));
			
			return Math.max(op1, Math.max(op2,op3));
		}
		
	}
	
	public static int lcsDP(String s1,String s2) {
		int storage[][]=new int[s1.length()+1][s2.length()+1];
	
		for(int i=0;i<s1.length()+1;i++) {
			for(int j=0;j<s2.length()+1;j++) {
				storage[i][j]=-1;
			}
		}
		
		return lcsDP(s1,s2,storage);
	}
	
	public static int lcsDP(String s1,String s2,int storage[][]) {
		int m=s1.length();
		int n=s2.length();
		
		if(storage[m][n]!=-1) {
			return storage[m][n];
		}
		if(m==0  || n==0) {
			return storage[m][n]=0;		 
		}
		
		if(s1.charAt(0)==s2.charAt(0)) {
			storage[m][n]=1+lcsDP(s1.substring(1),s2.substring(1),storage);
		}else {
			int op1=lcsDP(s1,s2.substring(1),storage);
			int op2=lcsDP(s1.substring(1),s2,storage);
			//int op3=lcsDP(s1.substring(1),s2);
			
			storage[m][n]=Math.max(op1, op2);
		}
		
		return storage[m][n];
	}
	
	public static int lcsD(String s1,String s2) {
		
		int m=s1.length();
		int n=s2.length();
		
		int dp[][]=new int[m+1][n+1];
		
		for(int i=0;i<m+1;i++) {
			dp[i][0]=0;
		}
		
		for(int j=0;j<n+1;j++) {
			dp[0][j]=0;
		}
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(s1.charAt(m-i)==s2.charAt(n-j)) {
					dp[i][j]=1+dp[i-1][j-1];
				}else {
					dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
				}
			}
		}
		
		return dp[m][n];	
		
	}

	public static void main(String[] args) {
		String s1="fasfjsakfjkdlsfs";
		String s2="fkjdskfjdsfdsf";
		
		System.out.println(lcsDP(s1,s2));
		System.out.println(lcsD(s1,s2));
		System.out.println(lcs(s1,s2));
		//System.out.println(l);
		
	}

}
