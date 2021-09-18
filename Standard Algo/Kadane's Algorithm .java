Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.
  
  class Solution {
    public int maxSubArray(int[] nums) {
      int sum=0;
      int maxsum=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            
            if(sum>maxsum){
                maxsum=sum;
            }
            
            if(sum<0){
                sum=0;
            }
        }
        
        return maxsum;
        
    }
}
