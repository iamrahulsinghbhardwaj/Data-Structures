/*
Given an integer h, find the possible number of balanced binary trees of height h. You just need to return the count of possible binary trees which are balanced.
This number can be huge, so, return output modulus 10^9 + 7.
Write a simple recursive solution.
Input Format :
The first and only line of input contains an integer, that denotes the value of h. Here, h is the height of the tree.
Output Format :
The first and only line of output contains the count of balanced binary trees modulus 10^9 + 7.
Constraints :
1 <= h <= 24
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
15
Sample Input 2:
4
Sample Output 2:
315

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws NumberFormatException, IOException {


        long n = Integer.parseInt(br.readLine().trim());
        System.out.print(Solution.balancedBTs(n));


    }
}

public class Solution {

	public static long balancedBTs(long height){
    	if(height==1 || height==0){
            return 1;
        }
        
        long h1=balancedBTs(height-1);
        long h2=balancedBTs(height-2);
        
        int mod=(int)Math.pow(10,9)+7;
        
        long res1=(long)h1*h1;
        long res2=(long)h1*h2*2;
        
        long value=res1%mod;
        long value2=res2%mod;
              
        return (value+value2)%mod;
        
	}
}
