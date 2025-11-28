class Solution {
    public int findMin(int[] nums) {
        
        // //M1 : Bruteforce 

        // int min = Integer.MAX_VALUE;

        // for(int i=0 ; i<nums.length ; i++) {
        //     if (min > nums[i]) {
        //         min = nums[i];
        //     }
        // }

        // return min;

        //since Asked O(log n) : so , BINARY SEARCH

        int n = nums.length;
        int st = 0;
        int end = n-1;

        while(st < end) {
            int mid = st + (end-st)/2;

            if(nums[mid] > nums[end]) {
                st = mid+1;
            } else {
                end = mid;
            }
        }

        // st == end : index of minimum element
        return nums[st];

    }
}