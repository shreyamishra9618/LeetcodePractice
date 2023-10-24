class Solution {
    public int majorityElement(int[] nums) {
        int maj = nums.length /2;
        int count =0;
        int maxEle=0;
        Arrays.sort(nums);
        for(int i =1; i < nums.length; i++){
            if(nums[i -1] == nums[i]){
                count++;
                if(count >= maj){
                   return  nums[i];
                }
            }
        }
       return nums[0];
    }
}