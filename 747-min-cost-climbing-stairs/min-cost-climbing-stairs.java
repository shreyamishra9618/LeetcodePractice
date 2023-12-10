class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int [] minStepsCost = new int[cost.length +1];
       for(int i =2; i < minStepsCost.length; i++){
           int takeOneStep = minStepsCost[i-1] + cost[i-1];
           int takeTwoSteps = minStepsCost[i-2]+cost[i-2];
           minStepsCost[i]= Math.min(takeOneStep, takeTwoSteps);
       }
       return minStepsCost[minStepsCost.length -1];
    }
}