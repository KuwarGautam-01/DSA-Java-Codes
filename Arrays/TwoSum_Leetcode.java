// class Solution {
//     public int[] twoSum(int[] nums, int target) {
           //BRUTEforce Approach. ::::::>

//         int n = nums.length;
//         int result[] = new int[2];

//         for(int i=0 ; i<n-1 ; i++) {
//             for(int j=i+1 ; j<n ; j++) {
//                 int sum = nums[i] + nums[j];

//                 if (sum == target) {
//                     result[0] = i;
//                     result[1] = j;
//                 }
//             }
//         }
//         return result;
//     }
// }


//Optimal Approach using HashMap ::::>


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            
            if (map.containsKey(needed)) {
                return new int[] { map.get(needed), i };
            }
            
            map.put(nums[i], i);
        }
        
        return new int[] {-1, -1}; 
    }
}
