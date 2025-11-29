import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // 1. Sort the array
        Arrays.sort(nums);
        int n = nums.length;
        
        // 2. Fix one number at a time (nums[i])
        for (int i = 0; i < n - 2; i++) {
            
            // Skip duplicate values for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int left = i + 1;
            int right = n - 1;
            
            // 3. Two-pointer approach for remaining two numbers
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    // Found a triplet
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);
                    result.add(triplet);
                    
                    // Skip duplicates for left and right
                    int leftVal = nums[left];
                    int rightVal = nums[right];
                    
                    while (left < right && nums[left] == leftVal) left++;
                    while (left < right && nums[right] == rightVal) right--;
                } 
                else if (sum < 0) {
                    left++;  // need bigger sum
                } 
                else {
                    right--; // need smaller sum
                }
            }
        }
        
        return result;
    }
}
