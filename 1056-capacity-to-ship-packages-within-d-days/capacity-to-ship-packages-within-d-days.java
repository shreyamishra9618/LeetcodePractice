class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int totalsum = 0;
        int n = weights.length;
        for(int i =0; i < n; i++){
            max= Math.max(max, weights[i]);
            totalsum += weights[i];
        }
        int low = max;
        int high = totalsum;
        int ans =0;
        while(low <= high){
            int mid = low + (high -low)/2;
            if(func(mid, weights, n , days)){
                ans = mid;
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
       return ans; 
    }

    public boolean func(int mid, int[] weights, int n, int noOfDays){
        int sum =0;
        int day =1;
        for(int i =0; i < n; i++){
            if(sum + weights[i] <= mid) sum += weights[i];
            else{
                sum = weights[i];
                day++;
            }
        }
        if(day <= noOfDays)return true;
        else return false;
    }
}