class Solution {
    public int maxSubArray(int[] nums) {

        // MY APPRAOCH (kadane's Agorithm) This Approach Fails in All -ve numbers Array.
        // int maxSum = Integer.MIN_VALUE;
        // int currSum = 0;

        // for(int i=0 ; i<nums.length ; i++) {
        //     currSum += nums[i];
        //     if (currSum < 0) {
        //         currSum = 0;
        //     }

        //     maxSum = Math.max(maxSum , currSum);
        // }

        // return maxSum;


        // OPTIMAL APPROACH : the best Approach 

        int cs = nums[0];  // current sum starts with first element
        int ms = nums[0];  // max sum starts with first element
        
        for (int i = 1; i < nums.length; i++) {
            cs = Math.max(nums[i], cs + nums[i]);  // either start new subarray or extend
            ms = Math.max(ms, cs);                 // update max sum
        }
        
        return ms;
    }
}
