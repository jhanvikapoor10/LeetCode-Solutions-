class Solution {
    public int removeDuplicates(int[] nums) {
        int officer = 1;
        int cm = 2;
        while(cm < nums.length){
            if(nums[cm] != nums[officer-1]){
                officer++;
                nums[officer] = nums[cm];
            }
            cm++;
        }
        return officer + 1;
    }
}
