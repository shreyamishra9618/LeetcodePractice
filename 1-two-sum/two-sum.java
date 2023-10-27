class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> set = new HashMap<>();
        int[] res= new int[2];
        for(int i =0; i < nums.length; i++){
            if(set.containsKey(target - nums[i])){
               res[0] =i;
               res[1] = set.get(target -nums[i]);
            }
            set.put(nums[i],i);
        }
       return res; 
    }
}