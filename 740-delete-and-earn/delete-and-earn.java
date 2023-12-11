class Solution {
    HashMap<Integer, Integer> points = new HashMap<>();
    HashMap<Integer, Integer> memo = new HashMap<>();
    public int deleteAndEarn(int[] nums) {
        int maxNum =0;
        for(int num : nums){
            points.put(num, points.getOrDefault(num,0)+num);
            maxNum = Math.max(maxNum, num);
        }
        return maxpoints(maxNum);
        
    }
    public int maxpoints(int num){
        if(num == 0) return 0;
        if( num == 1) return points.getOrDefault(num,0);
        if(memo.containsKey(num)){
            return memo.get(num);
        }
        int gain = points.getOrDefault(num,0);
        memo.put(num, Math.max(maxpoints(num -1), maxpoints(num -2)+ gain));
        return memo.get(num);
    }
}