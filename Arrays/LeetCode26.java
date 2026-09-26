class Solution {
    public int removeDuplicates(int[] nums) {
        int officer = 0;
        int cm = 1;
        int result = 1;
        while(cm < nums.length){
            if(nums[cm] == nums[cm - 1]){
                cm++;
            }
            else if(nums[cm] != nums[cm - 1]){
                nums[officer + 1] = nums[cm];
                officer++;
                result++;
                cm++;
            }
        }
        return result;
    }
}
