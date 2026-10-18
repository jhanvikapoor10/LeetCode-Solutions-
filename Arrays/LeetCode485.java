class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentSum = 0;
        int maxSum = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 1){
                currentSum++;
                if(currentSum > maxSum){
                    maxSum = currentSum;
                }
            }
            else{
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
