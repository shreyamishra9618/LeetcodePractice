class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 1) return nums[0];
        int l=1;
        int r=1;
        int ans =0;
        for(int i =0; i< nums.length; i++){
           l = l == 0 ? 1 : l;
           r = r == 0 ? 1 : r ;
           l *= nums[i];
           r *= nums[nums.length -1 -i];
           ans =Math.max(ans, Math.max(l,r));
        }
        return ans;
    }
}