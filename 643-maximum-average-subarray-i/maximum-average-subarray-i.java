class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left =1;
        int right = k;
        double sum =0, avg =0, max=0;
        for(int i =0; i < k ; i++){
            sum += nums[i];
        }
        avg = sum/k;
        max = avg;
        while(right < nums.length){
            sum += nums[right];
            sum -= nums[left -1];
            avg = sum/k;
            max =Math.max(max, avg);
            left++;
            right++;
        }
       return max; 
    }
}