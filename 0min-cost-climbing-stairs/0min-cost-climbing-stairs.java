class Solution {
    HashMap<Integer, Integer> memo = new HashMap<>();
    public int minCostClimbingStairs(int[] cost) {
        return minCost(cost.length, cost);   
    }
    public int minCost(int i, int[] cost){
        if( i <= 1) return 0;
        if(memo.containsKey(i)){
            return memo.get(i);
        }
        int takeOneStep = minCost(i-1, cost)+ cost[i-1];
        int takeTwoStep = minCost(i - 2, cost) + cost[i-2];
        memo.put(i, Math.min(takeOneStep, takeTwoStep) );
        return memo.get(i);
    }
}