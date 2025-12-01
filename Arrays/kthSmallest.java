class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here

        //M1: BruteForce Approach
        // Arrays.sort(arr);
        
        // return arr[k-1];


        //M2: using priority queue

        // PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // for(int i=0 ; i<arr.length ; i++) {
        //     maxHeap.add(arr[i]);

        //     if(maxHeap.size() > k) {
        //         maxHeap.poll();
        //     }
        // }
        // return maxHeap.peek();
        
        //M3: using QuickSelect Algorithm
        
        int n = arr.length;
        
        int left = 0;
        int right = n-1;
        int targetIndex = k-1;
        
        while(left <= right) {
            int pivotIndex = partition(arr , left , right);
            
            if (pivotIndex == targetIndex) {
                return arr[pivotIndex];
            } else if (pivotIndex < targetIndex) {
                left = pivotIndex+1;
            } else {
                right = pivotIndex-1;
            }
        }
        
        // should never reach here
        return -1;
    }
    
    public static int partition(int arr[] , int left , int right) {
        int pivot = arr[right];
        int i = left;
        
        for(int j=left ; j<right ; j++) {
            if (arr[j] <= pivot) {
                //start swapping
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        
        //placing pivot at right place
        int temp = arr[right];
        arr[right] = arr[i];
        arr[i] = temp;
        
        return i;
    }
}
