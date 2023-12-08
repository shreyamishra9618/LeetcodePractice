class Solution {
    private int[] nums;
    private HashMap<Integer, Integer> map = new HashMap<>();
    public int dp(int i){
        if(i == 0) return nums[0];
        if(i == 1) return Math.max(nums[0], nums[1]);
        if (!map.containsKey(i)) {
            // Consider robbing the current house or skipping it
            int robCurrent = nums[i] + dp(i - 2);
            int skipCurrent = dp(i - 1);
            
            // Store the maximum amount for the current house
            map.put(i, Math.max(robCurrent, skipCurrent));
        }
        
        return map.get(i);
    
    }
    public int rob(int[] nums) {
        this.nums = nums;
        return dp(nums.length -1);
        
    }
}