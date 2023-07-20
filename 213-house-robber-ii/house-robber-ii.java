class Solution {
    public int rob(int[] nums) {
               if (nums.length == 1) return nums[0];
        if(nums.length == 0) return 0;
        return Math.max(rob(nums, 0, nums.length -2), rob(nums, 1, nums.length -1));
        
    }
    private int rob(int[] nums, int start, int end){
        int a =0, b = 0;
        
        for( int i =start; i <= end ; i++){
            int temp = b;
            if((nums[i] + a) > b){
               b = nums[i] + a;
            }
             a = temp;
        }
        return b;
    }
}