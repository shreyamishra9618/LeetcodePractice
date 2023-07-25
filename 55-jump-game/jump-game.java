class Solution {
    public boolean canJump(int[] nums) {
        int goodlastpos = nums.length -1;
        for(int i =  nums.length -1; i >=0; i--){
            if(i+ nums[i] >=  goodlastpos){
                goodlastpos = i;
            }
        }
       return goodlastpos == 0;
    }
}