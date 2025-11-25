class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;

        //step 1 : Finding Pivot by finding first dec no from RHS
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            //reverse the array using 2 pointer approach
            int i = 0;
            int j = nums.length - 1;

            while (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j--;
            }
            return;
        }
        // Step 2 : Finding the just Greater Rightmost element to pivot and Swapping them
        for (int i = nums.length - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                //swap
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;

                break;
            }
        }

        // Step 3 : Reverse the after pivot part (2 pointer Approach)
        int i = pivot + 1;
        int j = nums.length - 1;

        while (i < j) {
            //swap
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }
}