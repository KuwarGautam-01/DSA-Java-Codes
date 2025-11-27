// class Solution {
//     public int findKthLargest(int[] nums, int k) {

//         //Method 1: USING SORTING (O(nlogn))

//         // Arrays.sort(nums);

//         // int result = nums[nums.length-k];

//         // return result;

//         //Method 2: USING QUICK SELECT ALGORITHM

//         int n = nums.length;

//         int left = 0;
//         int right = n - 1;
//         int targetIndex = n - k;

//         while (left <= right) {

//             int pivotIndex = partition(nums, left, right);

//             if (pivotIndex == targetIndex) {
//                 return nums[pivotIndex];
//             } else if (pivotIndex < targetIndex) {
//                 left = pivotIndex + 1;
//             } else {
//                 right = pivotIndex - 1;
//             }
//         }

//         return -1; //should never reach there
//     }

//     public static int partition(int nums[], int left, int right) {
//         int pivot = nums[right];
//         int i = left;

//         for (int j = left; j < right; j++) {
//             if (nums[j] <= pivot) {
//                 //swap
//                 int temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = temp;
//                 i++;
//             }
//         }

//         //placing pivot at right place
//         int temp = nums[right];
//         nums[right] = nums[i];
//         nums[i] = temp;

//         return i;
//     }
// }

import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // remove smallest
            }
        }

        return minHeap.peek(); // kth largest
    }
}
