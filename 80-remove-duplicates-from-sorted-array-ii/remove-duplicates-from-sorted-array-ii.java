class Solution {
    public int removeDuplicates(int[] nums) {
        int pos = 0;
        int curVal = nums[0];
        int count = 1;

        if(nums.length == 1){
            return 1;
        }

        for(int i = 1; i < nums.length; i++ ){
            if(nums[i] != curVal){
                pos++;
                nums[pos] = nums[i];
                curVal = nums[i];
                count = 1;
            } else if(nums[i] == curVal && count == 1){
                pos++;
                nums[pos] = nums[i];
                count = 2;
            }

            
        }

        return pos+1;
    }
}