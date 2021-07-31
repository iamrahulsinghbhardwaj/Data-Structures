/*

Given an input string (STR), print all possible permutations of the input string.
Note:
The input string may contain the same characters, so there will also be the same permutations.
The order of permutations doesn’t matter.
Input Format:
The only input line contains a string (STR) of alphabets in lower case
Output Format:
Print each permutations in a new line
Note:
You do not need to print anything, it has already been taken care of. Just implement the function.  
Constraint:
1<=length of STR<=8
Time Limit: 1sec
Sample Input 1:
cba
Sample Output 1:
abc
acb
bac
bca
cab
cba

*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim();
        Solution.FindPermutations(str);
    }
}


import java.util.*;
public class Solution {

	public static void FindPermutations(String input){
        char arr[]=input.toCharArray();
        FindPermutations(arr,0,input.length()-1);
	}
    
    public static void FindPermutations(char arr[],int l,int r){
		
        if(l>=r){
            String str=String.valueOf(arr);
            System.out.println(str);
            return;
        }
        
        for(int i=l;i<=r;i++){
			swap(arr,l,i);
            FindPermutations(arr,l+1,r);
            swap(arr,l,i);  //calling this swap bcq we need original stirng array when we reach at top again
        }
        
    }
    
    public static void swap(char a[],int i,int j){
        char te=a[i];
         a[i]=a[j];
         a[j]=te;
    }
}
