/*
Given an array of n numbers find the largest difference in the starting and ending indexes of the elements of all possible strictly decreasing sub-arrays in the array.

Example Input: 21, 13, 18, 10, 7, 3, 1

Output : 4

Explanation:

Here for element 1 the decreasing sub-array can be mapped till 18. It is 18, 10, 7, 3, 1.

Similarly, for 3 it can be mapped till 18 which is 18, 10, 7, 3. For 7 it can be mapped till 18 which is 18, 10, 7.

For 10 it can be mapped till 18 which is 18, 10. For 18 there is no continuous decreasing sub-sequence.

For 13 it is 21, 13.

The largest difference in indexes is at index 2 and index 6 that is 4.

Input Format

The first line of input contains T, the number of test cases
In each of the next T lines is contained n number of elements in the array, followed by the array elements
Output Format

Print T lines for all the required outputs


*/

import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int cases=sc.nextInt();
        
        while(cases-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
        
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        int start=0;
        int end=0;
        int cur_len=0;
        int max_len=0;
        
        while( end<n){
            if(end<n-1 && a[end]>a[end+1]){
                end++;
                cur_len=end-start;
                max_len=Math.max(cur_len,max_len);
            }else{
                start=end+1; //not start=start+1 bcq it will be in  same window
                end=end+1;
            }
            
        }
        System.out.println(max_len);
        }
        
    }
}




