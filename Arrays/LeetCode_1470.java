class LeetCode_1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] newarr = new int[2*n];
        for(int i = 0; i<n; i++){
            newarr[2*i] = nums[i];
            newarr[2*i+1] = nums[i+n];
        }
        return newarr;
    }
}
