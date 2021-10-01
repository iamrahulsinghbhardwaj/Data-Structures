/*
Next Greater Element
Difficulty Level : Medium
Last Updated : 26 Jul, 2021
Given an array, print the Next Greater Element (NGE) for every element. The Next greater Element for an element x is the first greater element on the right side of x in the array. Elements for which no greater element exist, consider the next greater element as -1. 

Examples: 

For an array, the rightmost element always has the next greater element as -1.
For an array that is sorted in decreasing order, all elements have the next greater element as -1.
For the input array [4, 5, 2, 25], the next greater elements for each element are as follows.
Element       NGE
   4      -->   5
   5      -->   25
   2      -->   25
   25     -->   -1
d) For the input array [13, 7, 6, 12}, the next greater elements for each element are as follows.  

  Element        NGE
   13      -->    -1
   7       -->     12
   6       -->     12
   12      -->     -1


*/

package Collections;
import java.util.*;
public class CNcheck {

	
	public static void print(int arr[],int n) {
		Stack<Integer> stack=new Stack<>();
		
		stack.push(arr[0]);
		
		int next=0;
		int element=0;
		
		for(int i=1;i<arr.length;i++) {
			next=arr[i];
			
			if(!stack.isEmpty()) {
				
				 element=stack.pop();
				
				 while(element<next) {
					 System.out.println(element+" "+next);
					 if(stack.isEmpty()) {
						 break;
					 }
					 element=stack.pop();
				 }
				 
				 if(element>next) {
					 stack.push(element);
				 }
				 
				 stack.push(next);
			}
			
		}
		
		while(!stack.isEmpty()) {
			element=stack.pop();
			next=-1;
			System.out.println(element+" "+next);
		}
		
	}
	
	public static void main(String[] args) {
		int arr[]= {11, 13, 21, 3};
        int n = arr.length;
        print(arr, n);

	}

}
