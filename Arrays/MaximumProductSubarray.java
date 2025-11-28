// class Solution {
//     public int maxProduct(int[] nums) {

//         // M1 : BruteForce Approach

//         // case 1: Array has Only 1 element
//         if(nums.length == 1) {
//             return nums[0];
//         }

//         //other cases :
//         int currP = 1;
//         int maxP = Integer.MIN_VALUE;

//         for(int i=0 ; i<nums.length ; i++) {
//             currP = 1;
//             for(int j=i ; j<nums.length ; j++) {
//                 currP *= nums[j];
//                 if (maxP < currP) {
//                     maxP = currP;
//                 }
//             }
//         }

//         return maxP;        
//     }
// }

//M2 : using KADANE'S Algorithm

class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;

        int currMax = nums[0];  // max product ending at current index
        int currMin = nums[0];  // min product ending at current index
        int ans = nums[0];      // global max producct

        for (int i = 1; i < n; i++) {
            int num = nums[i];

            // If current number is negative, swapping of currMax and currMin
            if (num < 0) {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            // Either start fresh from num, or extend previous product
            currMax = Math.max(num, currMax * num);
            currMin = Math.min(num, currMin * num);

            // Update global answer
            ans = Math.max(ans, currMax);
        }

        return ans;
    }
}
