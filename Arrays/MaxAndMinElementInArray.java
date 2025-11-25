class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int min = arr[0];
        int max = arr[0];
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=1 ; i<arr.length ; i++) {
            if (min > arr[i]) {
                min = arr[i];
            } else if (max < arr[i]) {
                max = arr[i];
            }
        }
        list.add(min);
        list.add(max);
        
        return list;
    }
}
