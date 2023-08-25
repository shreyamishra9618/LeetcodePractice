class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 0) return 0;
        int consecutive =1;
        int longestStreak =1;
        for(int i =1; i < nums.length; i++){
             if (nums[i] == nums[i - 1])
                continue; // Skip duplicate numbers
            
            if(nums[i] == nums[i -1] + 1){
                consecutive++;
              longestStreak = Math.max(longestStreak, consecutive);
            }
            else{
               
                consecutive =1;

            }
        }

        return longestStreak;
    }
}