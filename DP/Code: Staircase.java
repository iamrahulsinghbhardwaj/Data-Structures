/*
A child runs up a staircase with 'n' steps and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count and return all possible ways in which the child can run-up to the stairs.
Input format :
The first and the only line of input contains an integer value, 'n', denoting the total number of steps.
Output format :
Print the total possible number of ways.
 Constraints :
0 <= n <= 10 ^ 4

Time Limit: 1 sec
Sample Input 1:
4
Sample Output 1:
7
Sample Input 2:
10
Sample Output 2:
274

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
            int n = Integer.parseInt(br.readLine().trim());
            System.out.println(Solution.staircase(n));
    }
}


public class Solution {

	public static long staircase(int n) {
        if(n<0){
            return n;
        }
        
        if(n==1 || n==2){
            return n;
        }
        long a[]=new long[n+1];
        
        a[0]=1;
        a[1]=1;
        a[2]=2;
        
        for(int i=3;i<=n;i++){
            a[i]=a[i-1]+a[i-2]+a[i-3];
        }
        return a[n];
    }

}
