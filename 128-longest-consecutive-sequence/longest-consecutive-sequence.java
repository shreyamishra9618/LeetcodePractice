class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longest =0;
        for(int num : nums){
            set.add(num);
        }
        for(int num : nums){
            if(!set.contains(num -1)){
                int currentNum = num;
                int currentStreak =1;
                while(set.contains(currentNum +1)){
                    currentNum++;
                    currentStreak++;
                }
               longest = Math.max(longest, currentStreak);
            }
        }

       return longest; 
    }
}