class Solution {
    public boolean canJump(int[] nums) {
        int goodLastSteps = nums.length-1;
        for(int i = nums.length-1; i >= 0; i--){
            if(i + nums[i] >= goodLastSteps){
                goodLastSteps =i;
            }
        }
        return goodLastSteps == 0;
    }
}