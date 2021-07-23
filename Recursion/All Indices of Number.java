/*

All Indices of Number
Send Feedback
Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in an array (in increasing order).
Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
indexes where x is present in the array (separated by space)
Constraints :
1 <= N <= 10^3
Sample Input :
5
9 8 10 8 8
8
Sample Output :
1 3 4

*/

import java.util.Scanner;

public class Runner {
	
	static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		int output[] = Solution.allIndexes(input, x);
		for(int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}
}


public class Solution {

	public static int[] allIndexes(int input[], int x) {
        return allIndexes(input,x,0);
	}
    
      public static int[] allIndexes(int input[], int x,int startIndex){
        if(startIndex==input.length){
            int a[]=new int[0];
            return a;
        }
          
          int smallans[]=allIndexes(input,x,startIndex+1);
          
         if(input[startIndex]==x){
          		 int newarr[]=new int[smallans.length+1];
             	 
             	 newarr[0]=startIndex;
             
             	for(int i=0;i<smallans.length;i++){
					newarr[i+1]=smallans[i];
                }
             
             return newarr;
         }
          
         return smallans;
    }
}
