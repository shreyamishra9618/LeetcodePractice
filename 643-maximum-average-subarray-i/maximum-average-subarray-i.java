class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left =1;
        int right = k;
        double average =0;
        double sum = 0;
        double max =0;
        for(int i =0; i < k; i++){
            sum += nums[i];
        }
       average = sum/k;
       max = average;
       
        while(right < nums.length){
            System.out.println(nums[right]);
            sum += nums[right];
            sum -= nums[left -1];
            average = sum/k;
            max = Math.max(max, average);
            left++;
            right++;
        }
        return max;
    }
}